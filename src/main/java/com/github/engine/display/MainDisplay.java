package com.github.engine.display;

import com.github.engine.display.view.DefaultViewport;
import com.github.engine.display.view.Viewport;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.opengl.GL;
import org.lwjgl.opengl.GL11;
import org.lwjgl.system.MemoryUtil;

public class MainDisplay implements Display {

    private final Viewport viewport;
    private long window;

    private String windowName = "Apollo";
    private boolean vSync;
    private int maxFramesPerSecond = 60;

    public MainDisplay() {
        this.viewport = new DefaultViewport(this, 1080, 720);
    }

    @Override
    public void create() {
        GLFWErrorCallback.createPrint(System.err).set();

        if (!GLFW.glfwInit()) {
            throw new IllegalStateException("Unable to initialize GLFW");
        }

        GLFW.glfwDefaultWindowHints();
        GLFW.glfwWindowHint(GLFW.GLFW_VISIBLE, GL11.GL_FALSE);
        GLFW.glfwWindowHint(GLFW.GLFW_RESIZABLE, GL11.GL_TRUE);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MAJOR, 3);
        GLFW.glfwWindowHint(GLFW.GLFW_CONTEXT_VERSION_MINOR, 2);
        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_PROFILE, GLFW.GLFW_OPENGL_CORE_PROFILE);
        GLFW.glfwWindowHint(GLFW.GLFW_OPENGL_FORWARD_COMPAT, GL11.GL_TRUE);

        window = GLFW.glfwCreateWindow(viewport.getWidth(), viewport.getHeight(), windowName, MemoryUtil.NULL, MemoryUtil.NULL);
        if (window == MemoryUtil.NULL) {
            throw new RuntimeException("Failed to create the GLFW window");
        }

        GLFW.glfwSetKeyCallback(window, (window, key, scancode, action, mods) -> {
            if (key == GLFW.GLFW_KEY_ESCAPE && action == GLFW.GLFW_RELEASE) {
                GLFW.glfwSetWindowShouldClose(window, true);
            }
        });

        GLFWVidMode videoMode = GLFW.glfwGetVideoMode(GLFW.glfwGetPrimaryMonitor());

        GLFW.glfwSetWindowPos(
                window,
                (videoMode.width() - getViewport().getWidth()) / 2,
                (videoMode.height() - getViewport().getHeight()) / 2
        );

        GLFW.glfwMakeContextCurrent(window);

        if (vSync) {
            GLFW.glfwSwapInterval(1);
        }

        GLFW.glfwShowWindow(window);
        GL.createCapabilities();

        GL11.glClearColor(0.0f, 0.5f, 0.0f, 0.0f);
    }

    @Override
    public void update() {
        GLFW.glfwSwapBuffers(window);
        GLFW.glfwPollEvents();

        viewport.clear();
        viewport.render();
    }

    @Override
    public void close() {

    }

    @Override
    public long getWindow() {
        return window;
    }

    @Override
    public Viewport getViewport() {
        return viewport;
    }

    @Override
    public int getMaxFramesPerSecond() {
        return maxFramesPerSecond;
    }

    @Override
    public void setFramesPerSecond(int maxFramesPerSecond) {
        this.maxFramesPerSecond = maxFramesPerSecond;
    }

    @Override
    public boolean hasVSync() {
        return vSync;
    }

    @Override
    public void setVSync(boolean vSync) {
        if (vSync) {
            GLFW.glfwSwapInterval(1);
        } else {
            GLFW.glfwSwapInterval(0);
        }

        this.vSync = vSync;
    }

    public String getWindowName() {
        return windowName;
    }
}

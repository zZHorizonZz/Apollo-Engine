package com.github.engine;

import com.github.engine.display.Display;
import org.lwjgl.glfw.GLFW;

public class Engine {

    private Display display;
    private ApplicationStatus status = ApplicationStatus.STARTING;

    public void initialize(Display display) {
        this.display = display;
        display.create();

        status = ApplicationStatus.RUNNING;
    }

    public void update() {
        while (status.equals(ApplicationStatus.RUNNING) && !GLFW.glfwWindowShouldClose(display.getWindow())) {
            try {
                display.update();

                synchronize();
            } catch (RuntimeException exception) {
                exception.printStackTrace();
            } catch (InterruptedException exception) {
                exception.printStackTrace();
                status = ApplicationStatus.UNKNOWN;
            }
        }
    }

    public void destroy() {

    }

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    private void synchronize() throws InterruptedException {
        if (!display.hasVSync()) {
            while (System.nanoTime() / 0x3B9ACA00p0d < Time.getDeltaTimeAsDouble() + 1.0D / display.getMaxFramesPerSecond()) {
                Thread.sleep(1);
            }
        }
    }
}

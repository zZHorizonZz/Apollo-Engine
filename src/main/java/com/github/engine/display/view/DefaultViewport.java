package com.github.engine.display.view;

import com.github.engine.display.Color;
import com.github.engine.display.Display;
import org.lwjgl.opengl.GL11;

public class DefaultViewport extends Viewport {

    private Color backgroundColor = new Color(0, 80, 175, 1);

    public DefaultViewport(Display display, int width, int height) {
        super(display, width, height);
    }

    @Override
    public void preRender() {
        GL11.glClearColor(backgroundColor.getRedAsFloat(), backgroundColor.getGreenAsFloat(), backgroundColor.getBlueAsFloat(), 0.0f);
    }

    @Override
    public void render() {
        preRender();
    }

    @Override
    public void clear() {
        GL11.glClear(GL11.GL_COLOR_BUFFER_BIT | GL11.GL_DEPTH_BUFFER_BIT);
    }

    @Override
    public void cleanUp() {

    }

    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }
}

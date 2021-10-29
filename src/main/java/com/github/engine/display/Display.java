package com.github.engine.display;

import com.github.engine.display.view.Viewport;

public interface Display {

    long getWindow();

    Viewport getViewport();

    void create();

    void update();

    void close();

    int getMaxFramesPerSecond();

    void setFramesPerSecond(int maxFramesPerSecond);

    boolean hasVSync();

    void setVSync(boolean vSync);
}

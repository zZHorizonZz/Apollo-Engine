package com.github.engine.display;

import com.github.engine.display.view.Viewport;

public interface Display {

   /**
    * This method return identifier which can be used to get current window
    * data.
    */
    long getWindow();

    /**
    * Return current viewport.
    */
    Viewport getViewport();

    /**
    * Runs creation of display.
    */
    void create();

    /**
    * Updates current display.
    */
    void update();

    /**
    * Closes current window.
    */
    void close();

    int getMaxFramesPerSecond();

    void setFramesPerSecond(int maxFramesPerSecond);

    boolean hasVSync();

    void setVSync(boolean vSync);
}

/*
 *  Copyright 2021 Horizon
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.github.engine.display.view;

import com.github.engine.display.Display;

/**
 * Viewport is a class that is used to render object from scene
 * and convert them to the rendered object on our screen. Implementation of
 * this class should implement all necessary code that is used for proper
 * rendering from LWJGL library.
 *
 * @version 1.0
 * @since 1.0.alpha.1
 */
public abstract class Viewport {

    private final Display display;

    private int width;
    private int height;

    public Viewport(Display display, int width, int height) {
        this.display = display;

        this.width = width;
        this.height = height;
    }

    /**
     * Pre render method is called before actual render method is called
     * this is especially usual if we want to prepare some things for
     * actual render method and assure that they are done before render
     * method is called.
     *
     * @since 1.0
     */
    public abstract void preRender();

    /**
     * Render method is called when clear method is done with
     * its execution. This method should contain all necessary code
     * that is somehow related to rendering like setting background
     * color or rendering of the object's.
     *
     * @see DefaultViewport
     * @since 1.0
     */
    public abstract void render();

    /**
     * Clear method is called before render method is called and should
     * contain code that is used to clear screen like {@code GL11.glClear()}, etc.
     *
     * @see DefaultViewport
     * @since 1.0
     */
    public abstract void clear();

    /**
     * This method is used when we want to destroy this viewport, and it can
     * contain code that needs to be done to safely remove current viewport.
     *
     * @since 1.0
     */
    public abstract void cleanUp();

    public Display getDisplay() {
        return display;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

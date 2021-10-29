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
package com.github.engine.input;

import org.lwjgl.glfw.GLFW;

/**
 * Input class is used for detection of user interaction's with its hardware like
 * keyboard, mouse, gamepad, etc. This class basically translates and simplifies
 * method's that are in {@link GLFW} class.
 *
 * @version 1.0
 * @since 1.0.alpha.1
 */
public final class Input {

    /**
     * This method will detect and returns true if key with specified
     * key identifier is currently pressed, otherwise false is returned
     * is key is released.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    Identifier of the key.
     * @return If key is pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyDown(long window, int key) {
        return GLFW.glfwGetKey(window, key) == GLFW.GLFW_PRESS;
    }

    /**
     * This method will detect and returns true if key with specified
     * {@link Key} is currently pressed, otherwise false is returned
     * is key is released.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    {@link Key} which should be pressed.
     * @return If key is pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyDown(long window, Key key) {
        return GLFW.glfwGetKey(window, key.getKey()) == GLFW.GLFW_PRESS;
    }

    /**
     * This method will detect and returns true if key with specified
     * {@link String} which is used to find {@link Key} with similar name
     * (Also string is converted to upper-case). And then that key is used
     * to detect is key is currently pressed or not.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    {@link String} which should be name of the {@link Key} which should be pressed.
     * @return If key is pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyDown(long window, String key) {
        return GLFW.glfwGetKey(window, Key.valueOf(key).getKey()) == GLFW.GLFW_PRESS;
    }

    /**
     * This method will detect and returns true if key with specified
     * key identifier is not currently pressed, otherwise false is returned
     * is key is pressed.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    Identifier of the key.
     * @return If key is not pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyUp(long window, int key) {
        return GLFW.glfwGetKey(window, key) == GLFW.GLFW_RELEASE;
    }

    /**
     * This method will detect and returns true if key with specified
     * {@link Key} is not currently pressed, otherwise false is returned
     * is key is pressed.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    {@link Key} which should be pressed.
     * @return If key is not pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyUp(long window, Key key) {
        return GLFW.glfwGetKey(window, key.getKey()) == GLFW.GLFW_RELEASE;
    }

    /**
     * This method will detect and returns true if key with specified
     * {@link String} which is used to find {@link Key} with similar name
     * (Also string is converted to upper-case). And then that key is used
     * to detect is key is currently pressed or not.
     *
     * @param window Identifier of the window from which we want to detect
     *               our input key.
     * @param key    {@link String} which should be name of the {@link Key} which should not be pressed.
     * @return If key is not pressed true is returned otherwise false is returned.
     * @since 1.0
     */
    public static boolean getKeyUp(long window, String key) {
        return GLFW.glfwGetKey(window, Key.valueOf(key).getKey()) == GLFW.GLFW_RELEASE;
    }
}

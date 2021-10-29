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

public enum Key {

    SPACE(GLFW.GLFW_KEY_SPACE),
    RETURN(GLFW.GLFW_KEY_BACKSLASH),
    DELETE(GLFW.GLFW_KEY_BACKSPACE),
    TAB(GLFW.GLFW_KEY_TAB),
    ESCAPE(GLFW.GLFW_KEY_ESCAPE),
    CAPS_LOCK(GLFW.GLFW_KEY_CAPS_LOCK),
    NUM_LOCK(GLFW.GLFW_KEY_NUM_LOCK),
    F1(GLFW.GLFW_KEY_F1),
    F2(GLFW.GLFW_KEY_F2),
    F3(GLFW.GLFW_KEY_F3),
    F4(GLFW.GLFW_KEY_F4),
    F5(GLFW.GLFW_KEY_F5),
    F6(GLFW.GLFW_KEY_F6),
    F7(GLFW.GLFW_KEY_F7),
    F8(GLFW.GLFW_KEY_F8),
    F9(GLFW.GLFW_KEY_F9),
    F10(GLFW.GLFW_KEY_F10),
    F11(GLFW.GLFW_KEY_F11),
    F12(GLFW.GLFW_KEY_F12),
    KEYPAD_0(GLFW.GLFW_KEY_KP_0),
    KEYPAD_1(GLFW.GLFW_KEY_KP_1),
    KEYPAD_2(GLFW.GLFW_KEY_KP_2),
    KEYPAD_3(GLFW.GLFW_KEY_KP_3),
    KEYPAD_4(GLFW.GLFW_KEY_KP_4),
    KEYPAD_5(GLFW.GLFW_KEY_KP_5),
    KEYPAD_6(GLFW.GLFW_KEY_KP_6),
    KEYPAD_7(GLFW.GLFW_KEY_KP_7),
    KEYPAD_8(GLFW.GLFW_KEY_KP_8),
    KEYPAD_9(GLFW.GLFW_KEY_KP_9),
    KEYPAD_PERIOD(GLFW.GLFW_KEY_KP_DECIMAL),
    KEYPAD_DIVIDE(GLFW.GLFW_KEY_KP_DIVIDE),
    KEYPAD_MULTIPLY(GLFW.GLFW_KEY_KP_MULTIPLY),
    KEYPAD_MINUS(GLFW.GLFW_KEY_KP_SUBTRACT),
    KEYPADP_LUS(GLFW.GLFW_KEY_KP_ADD),
    KEYPAD_ENTER(GLFW.GLFW_KEY_KP_ENTER),
    KEYPAD_EQUAL(GLFW.GLFW_KEY_KP_EQUAL),
    ARROW_UP(GLFW.GLFW_KEY_UP),
    ARROW_DOWN(GLFW.GLFW_KEY_DOWN),
    ARROW_RIGHT(GLFW.GLFW_KEY_RIGHT),
    ARROW_LEFT(GLFW.GLFW_KEY_LEFT),
    LEFT_SHIFT(GLFW.GLFW_KEY_LEFT_SHIFT),
    RIGHT_SHIFT(GLFW.GLFW_KEY_RIGHT_SHIFT),
    LEFT_ALT(GLFW.GLFW_KEY_LEFT_ALT),
    RIGHT_ALT(GLFW.GLFW_KEY_RIGHT_ALT),
    LEFT_CTRL(GLFW.GLFW_KEY_LEFT_CONTROL),
    RIGHT_CTRL(GLFW.GLFW_KEY_RIGHT_CONTROL),
    KEY_A(GLFW.GLFW_KEY_A),
    KEY_B(GLFW.GLFW_KEY_B),
    KEY_C(GLFW.GLFW_KEY_C),
    KEY_D(GLFW.GLFW_KEY_D),
    KEY_E(GLFW.GLFW_KEY_E),
    KEY_F(GLFW.GLFW_KEY_F),
    KEY_G(GLFW.GLFW_KEY_G),
    KEY_H(GLFW.GLFW_KEY_H),
    KEY_I(GLFW.GLFW_KEY_I),
    KEY_J(GLFW.GLFW_KEY_J),
    KEY_K(GLFW.GLFW_KEY_K),
    KEY_L(GLFW.GLFW_KEY_L),
    KEY_M(GLFW.GLFW_KEY_M),
    KEY_N(GLFW.GLFW_KEY_N),
    KEY_O(GLFW.GLFW_KEY_O),
    KEY_P(GLFW.GLFW_KEY_P),
    KEY_Q(GLFW.GLFW_KEY_Q),
    KEY_R(GLFW.GLFW_KEY_R),
    KEY_S(GLFW.GLFW_KEY_S),
    KEY_T(GLFW.GLFW_KEY_T),
    KEY_U(GLFW.GLFW_KEY_U),
    KEY_V(GLFW.GLFW_KEY_V),
    KEY_W(GLFW.GLFW_KEY_W),
    KEY_X(GLFW.GLFW_KEY_X),
    KEY_Y(GLFW.GLFW_KEY_Y),
    KEY_Z(GLFW.GLFW_KEY_Z),
    UNKNOWN(-1);

    private final int key;

    Key(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}

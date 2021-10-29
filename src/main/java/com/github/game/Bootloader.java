package com.github.game;

import com.github.engine.Engine;
import com.github.engine.display.MainDisplay;

public class Bootloader {

    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.initialize(new MainDisplay());
        engine.update();
    }
}

package com.github.engine;

/**
* This class represents Time of the game and delta time on which
* game is currently running.
*/
public final class Time {

    private static final long gameStart = System.currentTimeMillis();
    private static long deltaTime = 0;
    private static long time = System.nanoTime();

    /**
    * This method will update current time.
    */
    public static void update() {
        System.nanoTime();
        deltaTime = System.nanoTime() - time;
        time = System.nanoTime();
    }

    public static long getGameStart() {
        return gameStart;
    }

    public static double getDeltaTimeAsDouble() {
        return deltaTime / 0x3B9ACA00p0d;
    }

    public static long getDeltaTime() {
        return deltaTime;
    }

    public static long getTime() {
        return time;
    }

    public static double getTimeAsDouble() {
        return time / 0x3B9ACA00p0d;
    }
}

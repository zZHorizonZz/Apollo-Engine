package com.github.engine.display;

public class Color {

    private int red;
    private int green;
    private int blue;
    private int alpha;

    public Color(int red, int green, int blue, int alpha) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.alpha = alpha;
    }

    public int getRed() {
        return red;
    }

    public float getRedAsFloat() {
        return (1.0f / 100.0f) * ((red / 255.0f) * 100.0f);
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public float getGreenAsFloat() {
        return (1.0f / 100.0f) * ((green / 255.0f) * 100.0f);
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public float getBlueAsFloat() {
        return (1.0f / 100.0f) * ((blue / 255.0f) * 100.0f);
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }
}

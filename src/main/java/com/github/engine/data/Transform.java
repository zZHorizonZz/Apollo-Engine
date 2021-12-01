package com.github.engine.data;

public record Transform(float x, float y, float z) {

    public float getX() {
        return x;
    }

    public Transform setX(float x) {
        return new Transform(x, y, z);
    }

    public float getY() {
        return y;
    }

    public Transform setY(float y) {
        return new Transform(x, y, z);
    }

    public float getZ() {
        return z;
    }

    public Transform setZ(float z) {
        return new Transform(x, y, z);
    }

    public Transform setPosition(float x, float y, float z) {
        return new Transform(x, y, z);
    }

    public Transform addPosition(float x, float y, float z) {
        return new Transform(this.x + x, this.y + y, this.z + z);
    }
}

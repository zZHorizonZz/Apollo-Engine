package com.github.engine.scene.object.component;

import com.github.engine.scene.object.GameObject;

public abstract class Component {

    private final GameObject gameObject;
    private boolean active = true;

    public Component(GameObject gameObject) {
        this.gameObject = gameObject;
    }

    public GameObject getGameObject() {
        return gameObject;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public abstract void update();
}

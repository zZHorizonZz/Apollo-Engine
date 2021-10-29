package com.github.engine.scene.object;

import com.github.engine.scene.object.component.Component;

import javax.management.openmbean.KeyAlreadyExistsException;
import java.util.*;

public class GameObject {

    private String name;

    private float x;
    private float y;
    private float z;

    private final List<Component> componentList = new ArrayList<>();
    private final Map<String, GameObject> childGameObject = new HashMap<>();

    public GameObject(String name) {
        this.name = name;
    }

    public GameObject(String name, float x, float y, float z) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void update() {
        componentList.forEach(Component::update);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public List<Component> getComponentList() {
        return componentList;
    }

    public Component getComponent(int index) {
        return componentList.get(index);
    }

    public Optional<Component> getComponent(Class<? extends Component> clazz) {
        return componentList.stream().filter(component -> component.getClass().equals(clazz)).findAny();
    }

    public Map<String, GameObject> getChildGameObject() {
        return childGameObject;
    }

    public Optional<GameObject> getChildGameObject(String name) {
        return Optional.ofNullable(childGameObject.get(name));
    }

    public void addChildGameObject(GameObject gameObject) {
        if (childGameObject.containsKey(gameObject.getName())) {
            throw new KeyAlreadyExistsException("Game Object with name \"" + gameObject.getName() + "\" already exists.");
        }

        childGameObject.put(gameObject.getName(), gameObject);
    }
}

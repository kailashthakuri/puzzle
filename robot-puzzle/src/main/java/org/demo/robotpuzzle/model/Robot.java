package org.demo.robotpuzzle.model;

public class Robot {
    private String id;
    private Position position;

    public Robot(String id, Position position) {
        this.id = id;
        this.position = position;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return id + ": " + position;
    }
}

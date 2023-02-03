package org.demo.robotpuzzle.control;


import org.demo.robotpuzzle.model.Direction;
import org.demo.robotpuzzle.model.Position;

public class EastControl implements Control {
    @Override
    public void turnLeft(Position position) {
        position.setDirection(Direction.N);
    }

    @Override
    public void turnRight(Position position) {
        position.setDirection(Direction.S);
    }

    @Override
    public void move(Position position) {
        position.setX(position.getX() + 1);
    }
}

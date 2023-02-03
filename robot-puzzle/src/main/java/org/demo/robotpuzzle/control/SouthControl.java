package org.demo.robotpuzzle.control;

import org.demo.robotpuzzle.model.Direction;
import org.demo.robotpuzzle.model.Position;

public class SouthControl implements Control{
    @Override
    public void turnLeft(Position position) {
        position.setDirection(Direction.E);
    }

    @Override
    public void turnRight(Position position) {
        position.setDirection(Direction.W);
    }

    @Override
    public void move(Position position) {
        position.setY(position.getY() - 1);
    }
}

package org.demo.robotpuzzle.control;


import org.demo.robotpuzzle.model.Position;

public interface Control {
    void turnLeft(Position position);

    void turnRight(Position position);

    /**
     * might need to prevent going outside the grid. ie negative x and y values.
     */
    void move(Position position);
}

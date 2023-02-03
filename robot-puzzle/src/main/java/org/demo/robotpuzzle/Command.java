package org.demo.robotpuzzle;

import org.demo.robotpuzzle.model.Position;

import java.util.function.Consumer;

/**
 * Commands and it's corresponding execution.
 * Can be used subclassing instead of lambda expression
 */
public enum Command {
    L(
            (position) -> {
                position.getDirection().getControl().turnLeft(position);
            }
    ), R(
            (position) -> {
                position.getDirection().getControl().turnRight(position);
            }
    ), M(
            (position) -> {
                position.getDirection().getControl().move(position);
            }
    );

    public Consumer<Position> consumer;

    Command(Consumer<Position> consumer) {
        this.consumer = consumer;
    }

    public Consumer<Position> getControl() {
        return consumer;
    }
}

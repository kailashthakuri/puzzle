package org.demo.robotpuzzle;


import org.demo.robotpuzzle.model.Position;

import java.util.List;

public class CommandExecutor {

    private Position position;

    public CommandExecutor() {
    }

    public Position getPosition() {
        return position;
    }

    public CommandExecutor setPosition(Position position) {
        this.position = position;
        return this;
    }

    public CommandExecutor execute(List<Command> commands) {
        for (Command command : commands) {
            command.getControl().accept(position);
        }
        return this;
    }
}

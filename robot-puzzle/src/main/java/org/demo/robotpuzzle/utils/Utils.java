package org.demo.robotpuzzle.utils;

import org.demo.robotpuzzle.Command;
import org.demo.robotpuzzle.model.Direction;
import org.demo.robotpuzzle.model.Position;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

    public static Position getPosition(String input) {
        String[] commands = input.split(" ");
        return new Position(Integer.parseInt(commands[0]), Integer.parseInt(commands[1]), Direction.valueOf(commands[2]));
    }

    public static List<Command> getCommands(String input) {
        return Arrays.stream(input.split(""))
                .map(Command::valueOf)
                .collect(Collectors.toList());
    }
}

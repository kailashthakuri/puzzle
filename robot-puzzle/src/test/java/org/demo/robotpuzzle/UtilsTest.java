package org.demo.robotpuzzle;

import org.demo.robotpuzzle.Command;
import org.demo.robotpuzzle.model.Direction;
import org.demo.robotpuzzle.model.Position;
import org.demo.robotpuzzle.utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class UtilsTest {

    @Test
    public void getPositionForGivenInput() {
        Position position = Utils.getPosition("1 2 N");
        Assertions.assertEquals(position.getDirection(), Direction.N);
        Assertions.assertEquals(position.getX(), 1);
        Assertions.assertEquals(position.getY(), 2);
    }

    @Test
    public void getCommandsForGivenInput() {
        List<Command> commands = Utils.getCommands("LMRRM");
        Assertions.assertEquals(commands, Arrays.asList(Command.L, Command.M, Command.R, Command.R, Command.M));
    }

}

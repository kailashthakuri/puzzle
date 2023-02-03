package org.demo.robotpuzzle;
import org.demo.robotpuzzle.model.Robot;
import org.demo.robotpuzzle.utils.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CommandExecutorTest {


    @Test
    public void shouldExecuteCommandCorrectlyTest1() {
        CommandExecutor commandExecutor = new CommandExecutor();

        Robot robot1 = new Robot("Spidernaut", Utils.getPosition("1 2 N"));
        commandExecutor.setPosition(robot1.getPosition())
                .execute(Utils.getCommands("LMLMLMLMM"));
        Assertions.assertEquals(robot1.getPosition().toString(), "1 3 N");
    }

    @Test
    public void shouldExecuteCommandCorrectlyTest2() {
        CommandExecutor commandExecutor = new CommandExecutor();

        Robot robot2 = new Robot("RASSOR", Utils.getPosition("3 3 E"));
        commandExecutor.setPosition(robot2.getPosition())
                .execute(Utils.getCommands("MMRMMRMRRM"));
        Assertions.assertEquals(robot2.getPosition().toString(), "5 1 E");
    }

}

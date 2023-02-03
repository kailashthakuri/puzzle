package org.demo.robotpuzzle;

import org.demo.robotpuzzle.model.Robot;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class RobotNavigatorTest {
    @Test
    public void shouldNavigateRobots() {
        RobotNavigator robotNavigator = new RobotNavigator();

        robotNavigator.register("Spidernaut", "1 2 N", "LMLMLMLMM");
        robotNavigator.register("RASSOR", "3 3 E", "MMRMMRMRRM");
        robotNavigator.navigateAll();

        List<Robot> robots = robotNavigator.getRobots();
        Assertions.assertEquals(robots.get(0).getPosition().toString(), "1 3 N");
        Assertions.assertEquals(robots.get(1).getPosition().toString(), "5 1 E");
    }

}

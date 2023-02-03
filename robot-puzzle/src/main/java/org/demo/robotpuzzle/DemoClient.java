package org.demo.robotpuzzle;

public class DemoClient {
    public static void main(String[] args) {
        RobotNavigator robotNavigator = new RobotNavigator();

        robotNavigator.register("Spidernaut", "1 2 N", "LMLMLMLMM");
        robotNavigator.register("RASSOR", "3 3 E", "MMRMMRMRRM");
        robotNavigator.navigateAll();

        robotNavigator.getRobots().forEach(robot -> {
            System.out.println(robot.getPosition());
        });

    }
}

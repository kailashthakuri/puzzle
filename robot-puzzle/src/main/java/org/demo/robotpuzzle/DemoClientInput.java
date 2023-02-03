package org.demo.robotpuzzle;

import java.util.Scanner;

public class DemoClientInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RobotNavigator robotNavigator = new RobotNavigator();
        String moreRobots = "";

        // todo: add input validation
        do {
            System.out.print("Enter robot name: ");
            String robotName = scanner.nextLine();
            System.out.print("Enter position of " + robotName + ": ");
            String position = scanner.nextLine();
            System.out.print("Enter navigation command for " + robotName + ": ");
            String command = scanner.nextLine();


            robotNavigator.register(robotName, position, command);
            System.out.print("Press Enter to see result or any other keys to add new robot: ");
            moreRobots = scanner.nextLine();
        } while (!moreRobots.isEmpty());
        robotNavigator.navigateAll();
        robotNavigator.getRobots().forEach(System.out::println);
    }
}

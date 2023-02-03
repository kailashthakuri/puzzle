package org.demo.robotpuzzle;

import org.demo.robotpuzzle.model.Robot;
import org.demo.robotpuzzle.utils.Utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class RobotNavigator {
    // use LinkedHashMap to reserve insertion order.
    private final Map<Robot, List<Command>> map = new LinkedHashMap<>();

    private final CommandExecutor commandExecutor;

    public RobotNavigator() {
        this.commandExecutor = new CommandExecutor();
    }

    public RobotNavigator register(String name, String input1, String input2) {
        Robot robot = new Robot(name, Utils.getPosition(input1));
        map.put(robot, Utils.getCommands(input2));
        return this;
    }

    public void navigateAll() {
        map.forEach((key, value) -> this.commandExecutor.setPosition(key.getPosition()).execute(value));
    }

    public List<Robot> getRobots() {
        return new ArrayList<>(map.keySet());
    }

}

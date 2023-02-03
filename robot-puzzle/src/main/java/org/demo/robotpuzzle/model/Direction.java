package org.demo.robotpuzzle.model;


import org.demo.robotpuzzle.control.Control;
import org.demo.robotpuzzle.control.EastControl;
import org.demo.robotpuzzle.control.NorthControl;
import org.demo.robotpuzzle.control.SouthControl;
import org.demo.robotpuzzle.control.WestControl;

/**
 * Each Direction and it's corresponding Control
 */
public enum Direction {
    E(new EastControl()),
    W(new WestControl()),
    N(new NorthControl()),
    S(new SouthControl());

    private final Control control;

    Direction(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }
}

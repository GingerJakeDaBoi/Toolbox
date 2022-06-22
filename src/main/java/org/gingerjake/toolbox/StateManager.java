package org.gingerjake.toolbox;

import java.awt.*;
import java.util.Stack;

public class StateManager {
    public final Stack<StartInit> states;

    public StateManager() {
        states = new Stack<>();
        states.push(new StartInit(this));
    }

    public void tick() {
        states.peek().tick();
    }

    public void draw(Graphics g) {
        states.peek().draw(g);
    }
}

package org.gingerjake.toolbox;

import java.awt.*;
import java.util.Stack;

public class InitManager {
    public final Stack<StartInit> states;

    public InitManager() {
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

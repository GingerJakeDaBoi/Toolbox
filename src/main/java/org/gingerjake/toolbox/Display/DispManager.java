package org.gingerjake.toolbox.Display;

import java.awt.*;
import java.util.Stack;

public class DispManager {
    public final Stack<StartDisp> states;

    public DispManager() {
        states = new Stack<>();
        states.push(new StartDisp(this));
    }

    public DispManager(Stack<StartDisp> states) {
        this.states = states;
    }

    public void tick() {
        states.peek().tick();
    }

    public void draw(Graphics g) {
        states.peek().draw(g);
    }
}

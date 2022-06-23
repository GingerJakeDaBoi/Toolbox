package org.gingerjake.toolbox;

import java.awt.*;
import java.util.Stack;

public class TermManager {
    public final Stack<StartTerm> states;

    public TermManager() {
        states = new Stack<>();
        states.push(new StartTerm(this));
    }

    public void tick() {
        states.peek().tick();
    }

    public void draw(Graphics g) {
        states.peek().draw(g);
    }
}

package org.gingerjake.toolbox.Filesystem;

import org.gingerjake.toolbox.Terminal.StartTerm;

import java.awt.*;
import java.util.Stack;

public class FSManager {
    public final Stack<StartTerm> states;

    public FSManager() {
        states = new Stack<>();
        states.push(new StartTerm(this));
    }

    public FSManager(Stack<StartTerm> states) {
        this.states = states;
    }

    public void tick() {
        states.peek().tick();
    }

    public void draw(Graphics g) {
        states.peek().draw(g);
    }

}

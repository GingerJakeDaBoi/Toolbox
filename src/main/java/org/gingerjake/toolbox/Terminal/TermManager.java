package org.gingerjake.toolbox.Terminal;

import org.gingerjake.toolbox.Filesystem.StartFS;

import java.awt.*;
import java.util.Stack;

public class TermManager {
    public final Stack<StartFS> states;

    public TermManager() {
        states = new Stack<>();
        states.push(new StartFS(this));
    }

    public void tick() {
        states.peek().tick();
    }

    public void draw(Graphics g) {
        states.peek().draw(g);
    }
}

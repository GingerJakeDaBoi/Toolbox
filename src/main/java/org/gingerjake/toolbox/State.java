package org.gingerjake.toolbox;

import org.gingerjake.toolbox.Display.DispManager;

import java.awt.*;

public class State {

    public abstract static class ServerState {
        public abstract void init();

        protected final DispManager ssm;

        public abstract void draw(Graphics g);

        public abstract void tick();

        public ServerState(DispManager ssm) {
            this.ssm = ssm;
            init();
        }
    }
}

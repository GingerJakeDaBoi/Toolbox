package org.gingerjake.toolbox;

import java.awt.*;

public class State {

    public abstract static class ServerState {
        public abstract void init();

        protected final InitManager ssm;

        public abstract void draw(Graphics g);

        public abstract void tick();

        public ServerState(InitManager ssm) {
            this.ssm = ssm;
            init();
        }
    }
}

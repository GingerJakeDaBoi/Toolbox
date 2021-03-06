package org.gingerjake.toolbox.Terminal;

import javax.swing.*;
import java.awt.*;

public class Terminal extends JPanel implements Runnable {

    private boolean isRunning = false;
    public static final int width = 800;
    public static final int height = 600;
    private TermManager sm;

    public Terminal() {
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        start();
    }

    private void start() {
        isRunning = true;
        Thread thread = new Thread(this);
        thread.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, width, height);
        sm.draw(g);
    }

    public void tick() {
        sm.tick();
    }

    public void run() {
        long start, elapsed, wait;
        sm = new TermManager();
        while (isRunning) {
            tick();
            repaint();

            int FPS = 60;
            long TARGET_TIME = 1000 / FPS;
        }
    }
}

package org.gingerjake.toolbox.Display;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements Runnable {
    private final String[] LABELS = {"foo", "bar"};
    private DispManager sm = new DispManager();
    private final Thread worker;
    boolean running;
    boolean stopped;
    int interval = 1000 / 60;

    public Display() {
        setFocusable(true);
        worker = new Thread(this);
        worker.start();
        sm = new DispManager();
        run();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.clearRect(0, 0, 800, 600);
        sm.draw(g);
    }

    public void tick() {
        sm.tick();

    }

    public void interrupt() {
        running = false;
        worker.interrupt();
    }

    boolean isRunning() {
        return running;
    }

    boolean isStopped() {
        return stopped;
    }

    public void run() {
        running = true;
        stopped = false;
        while (running) {
            try {
                Thread.sleep(interval);
                return;
            } catch (InterruptedException e) {
                stopped = true;
                running = false;
            }
            tick();
            repaint();
        }
    }
}


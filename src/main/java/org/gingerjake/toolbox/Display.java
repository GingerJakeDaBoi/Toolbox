package org.gingerjake.toolbox;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements Runnable {

    private boolean isRunning = false;
    public static final int width = 800;
    public static final int height = 600;
    private final String[] LABELS={"System Resources"};
    private Thread thread;
    private StateManager sm;
    private final int FPS = 60;
    private final long TARGET_TIME=1000/FPS;

        public Display(){
            setPreferredSize(new Dimension(width,height));
            setFocusable(true);
            start();
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.clearRect(0,0,width,height);
            sm.draw(g);
        }

    private void start() {
            isRunning = true;
            thread = new Thread(this);
            thread.start();
        }

        public void init() {

        }

        public void draw(Graphics g) {
            //Set the background color
            g.setColor(new Color(93, 93, 93, 255));
            g.fillRect(0, 0, Display.width, Display.height);

            //Draw the labels, look at the top for the list
            for (int i = 0; i < LABELS.length; i++) {
                g.setColor(Color.white);

                //Category Labels
                g.setFont(new Font("Arial", Font.BOLD, 16));
                g.drawString(LABELS[i], 25, 80 + i * 225);

            }
        }
        public void tick() {
            sm.tick();
        }

    public void run() {

    }
}


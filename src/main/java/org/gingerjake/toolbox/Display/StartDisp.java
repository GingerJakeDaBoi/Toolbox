package org.gingerjake.toolbox.Display;

import java.awt.*;

public class StartDisp extends Display {
    private final String[] LABELS = {"foo", "bar"};

    public StartDisp(DispManager ssm) {
        super();
    }

    public void init() {

    }

    public void draw(Graphics g) {
        //Set the background color
        g.setColor(Color.white);
        g.fillRect(0, 0, Display.width, Display.height);

        //Draw the labels, look at the top for the list
        for (int i = 0; i < LABELS.length; i++) {

            //Text in the middle of the screen
            g.setColor(new Color(255, 0, 0, 255));
            g.drawString(LABELS[i], Display.width / 2 - LABELS[i].length() * 5, Display.height / 2 - LABELS[i].length() * 5 + i * 20);
            //Category Labels spread apart
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.setColor(new Color(0, 0, 0, 255));
            g.drawString(LABELS[i], 25, 80 + i * 100);

        }
    }

    public void tick() {
        repaint();

    }
}

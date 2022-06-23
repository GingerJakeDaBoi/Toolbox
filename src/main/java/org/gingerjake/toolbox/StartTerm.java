package org.gingerjake.toolbox;

import java.awt.*;

@SuppressWarnings("MismatchedReadAndWriteOfArray")
public class StartTerm extends Terminal{
    private final String[] LABELS = {"foo", "bar"};

    public StartTerm(TermManager ssm) {
        super();
    }

    public void init() {

    }

    public void draw(Graphics g) {
        //Set the background color
        g.setColor(Color.black);
        g.fillRect(0, 0, Display.width, Display.height);

        //Draw the labels, look at the top for the list
        for (int i = 0; i < LABELS.length; i++) {
            //Category Labels spread apart
            g.setFont(new Font("Arial", Font.BOLD, 56));
            g.setColor(new Color(255, 255, 255, 255));
            g.drawString(">_", 20, 50);

            //Text that reads ">_" in the top left corner
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.setColor(new Color(255, 255, 255, 255));


        }
    }

    public void tick() {
        repaint();

    }
}

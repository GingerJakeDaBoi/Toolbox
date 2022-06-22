package org.gingerjake.toolbox;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class StartInit extends State{
    private final String[] LABELS={"foo", "bar"};

    public StartInit(StateManager ssm){
//        super(ssm);
    }

    public void init() {

    }

    public void draw(@NotNull Graphics g) {
        //Set the background color
        g.setColor(Color.white);
//        g.fillRect(0, 0, Display.width, Display.height); this is broken, fix before using.

        //Draw the labels, look at the top for the list
        for (int i = 0; i < LABELS.length; i++) {


            g.setColor(new Color(255, 0, 0, 255));
            //Category Labels
            g.setFont(new Font("Arial", Font.BOLD, 16));
            g.drawString(LABELS[i], 25, 80 + i * 225);

        }
    }
    public void tick() {

    }
}

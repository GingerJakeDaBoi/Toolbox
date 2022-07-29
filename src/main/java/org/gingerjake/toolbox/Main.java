package org.gingerjake.toolbox;

import org.gingerjake.toolbox.Display.DispManager;
import org.gingerjake.toolbox.Display.Display;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Toolbox");
        System.out.println("Toolbox");
        JPanel panel = new JPanel();
        System.out.println("Toolbox");
        panel.setLayout(new BorderLayout());
        System.out.println("Toolbox");
        frame.add(panel);
        System.out.println("Toolbox");
        panel.add(new Display(), BorderLayout.CENTER);
        System.out.println("Toolbox");
        System.out.println("It works!");


        System.out.println("Don't wanna be an American Idiot,");
        for (String s : Arrays.asList("Don't wanna be an American Idiot,", "One nation under the new media...", "And can you hear the sound of hysteria?", "It's calling out to Idiot America!")) {
            System.out.println(s);
        }


    }

}

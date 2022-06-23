package org.gingerjake.toolbox;

import org.gingerjake.toolbox.Display.Display;
import org.gingerjake.toolbox.Terminal.Terminal;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        JFrame MainWindow = new JFrame("Test");
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel Display = new JPanel();

        MainWindow.add(Display);
        Display.add(new Display(), BorderLayout.CENTER);
        MainWindow.pack();
        MainWindow.setVisible(true);
        MainWindow.setResizable(false);

        System.out.println("Don't wanna be an American Idiot,");
        for (String s : Arrays.asList("One nation under the new media...", "And can you hear the sound of hysteria?", "It's calling out to Idiot America!")) {
            System.out.println(s);
        }

        //Add a button to the window
        JButton TermButton = new JButton("Terminal");
        MainWindow.add(TermButton, BorderLayout.SOUTH);
        //when the button is clicked, make a new window that is black and is 400x400
        TermButton.addActionListener(e -> {
            JFrame TermWindow = new JFrame("Terminal");
            TermWindow.add(new Terminal(), BorderLayout.CENTER);
            TermWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            TermWindow.pack();
            TermWindow.setVisible(true);
            TermWindow.setResizable(false);
        });

    }

}

package org.gingerjake.toolbox;

import org.gingerjake.toolbox.Display.Display;
import org.gingerjake.toolbox.Filesystem.Filesystem;
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

        //Add a button to the window
        JButton FileButton = new JButton("Filesystem");
        MainWindow.add(FileButton, BorderLayout.NORTH);
        //when the button is clicked, make a new window that is black and is 400x400
        FileButton.addActionListener(e -> {
            JFrame FSWindow = new JFrame("Filesystem");
            FSWindow.add(new Filesystem(), BorderLayout.CENTER);
            FSWindow.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            FSWindow.pack();
            FSWindow.setVisible(true);
            FSWindow.setResizable(false);
        });


    }

}

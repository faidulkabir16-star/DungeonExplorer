package com.dungeonexplorer;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dungeon Explorer");

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
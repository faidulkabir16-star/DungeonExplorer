package com.dungeonexplorer.gui;

import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GameWindow extends JFrame {

    public GameWindow() {

        setTitle("Dungeon Explorer");

        setSize(800, 600);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLocationRelativeTo(null);

        setLayout(new BorderLayout());


        GamePanel gamePanel = new GamePanel();
        StatusPanel statusPanel = new StatusPanel();
        LogPanel logPanel = new LogPanel();


        add(statusPanel, BorderLayout.NORTH);
        add(gamePanel, BorderLayout.CENTER);
        add(logPanel, BorderLayout.SOUTH);


        setVisible(true);
    }
}
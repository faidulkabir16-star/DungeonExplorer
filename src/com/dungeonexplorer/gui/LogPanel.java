package com.dungeonexplorer.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.BorderLayout;

public class LogPanel extends JPanel {

    private JTextArea logArea;

    public LogPanel() {

        setLayout(new BorderLayout());

        logArea = new JTextArea();

        logArea.setEditable(false);

        logArea.append("Welcome to Dungeon Explorer!\n");

        JScrollPane scrollPane = new JScrollPane(logArea);

        add(scrollPane, BorderLayout.CENTER);
    }
}
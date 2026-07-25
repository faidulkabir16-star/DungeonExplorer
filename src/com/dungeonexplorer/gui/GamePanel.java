package com.dungeonexplorer.gui;

import com.dungeonexplorer.game.Player;

import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class GamePanel extends JPanel {

    private static final int ROWS = 5;
    private static final int COLS = 5;

    private JPanel[][] cells;

    private Player player;

    public GamePanel() {

        setLayout(new GridLayout(ROWS, COLS));

        cells = new JPanel[ROWS][COLS];

        player = new Player("Hero");

        createGrid();

        placePlayer();

    }

    private void createGrid() {

        for (int row = 0; row < ROWS; row++) {

            for (int col = 0; col < COLS; col++) {

                JPanel cell = new JPanel(new java.awt.BorderLayout());

                cell.setBorder(
                        BorderFactory.createLineBorder(java.awt.Color.BLACK)
                );

                cells[row][col] = cell;

                add(cell);
            }
        }
    }

    private void placePlayer() {

        JLabel playerLabel = new JLabel("P");

        playerLabel.setHorizontalAlignment(JLabel.CENTER);
        playerLabel.setVerticalAlignment(JLabel.CENTER);

        cells[player.getRow()][player.getCol()]
                .add(playerLabel, java.awt.BorderLayout.CENTER);
    }
}
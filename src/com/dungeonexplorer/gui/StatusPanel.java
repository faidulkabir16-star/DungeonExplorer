package com.dungeonexplorer.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.FlowLayout;

public class StatusPanel extends JPanel {

    private JLabel hpLabel;
    private JLabel weaponLabel;

    public StatusPanel() {

        setLayout(new FlowLayout());

        hpLabel = new JLabel("HP: 100");

        weaponLabel = new JLabel("Weapon: None");

        add(hpLabel);
        add(weaponLabel);
    }
}
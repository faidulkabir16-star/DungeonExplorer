package com.dungeonexplorer.game;

public class Player {

    private String name;

    private int row;
    private int col;

    public Player(String name) {

        this.name = name;

        row = 0;
        col = 0;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
}
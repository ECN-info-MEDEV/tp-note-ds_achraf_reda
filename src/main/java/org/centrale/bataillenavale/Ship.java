/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.bataillenavale;

/**
 *
 * @author USER
 */
public abstract class Ship {
    private int length;
    private int startRow;
    private int startColumn;
    private boolean isHorizontal;
    private boolean sunk;
    protected int hitPoints;
    protected int[] startPosition; // Format: [row, column]

     public Ship(int length, int startRow, int startColumn, boolean isHorizontal) {
        this.length = length;
        this.startRow = startRow;
        this.startColumn = startColumn;
        this.isHorizontal = isHorizontal;
        this.startPosition = new int[2]; // Initialize the startPosition array.

        this.sunk = false;
    }
     public boolean isHit(int row, int column) {
        if (isHorizontal) {
            return row == startRow && column >= startColumn && column < startColumn + length;
        } else {
            return column == startColumn && row >= startRow && row < startRow + length;
        }
    }
    public int getLength() {
        return length;
    }

    public boolean isSunk() {
        return sunk;
    }

    public void setSunk(boolean sunk) {
        this.sunk = sunk;
    }
     public boolean isHorizontal() {
        return isHorizontal;
    }

    public int getStartRow() {
        return startRow;
    }

    public int getStartColumn() {
        return startColumn;
    }
    // Additional methods like hit and check placement will be added later
public void setStartPosition(int row, int column, boolean isHorizontal) {
        this.startRow = row;
        this.startColumn = column;
        this.isHorizontal = isHorizontal;
    }
}

// Example of a specific ship class

// Additional ship types like AircraftCarrier, Battleship, etc., can be defined similarly

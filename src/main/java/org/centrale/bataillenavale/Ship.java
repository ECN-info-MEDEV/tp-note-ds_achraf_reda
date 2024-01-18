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
    protected int length;
    protected int hitPoints;
    protected int[] startPosition; // Format: [row, column]
    protected boolean isHorizontal;

    public Ship(int length, int row, int column, boolean isHorizontal) {
        this.length = length;
        this.hitPoints = length; // Initially, hit points are equal to the length of the ship
        this.startPosition = new int[]{row, column};
        this.isHorizontal = isHorizontal;
    }

    public int getLength() {
        return length;
    }

    public boolean isSunk() {
        return hitPoints == 0;
    }

    // Additional methods like hit and check placement will be added later
}

// Example of a specific ship class

// Additional ship types like AircraftCarrier, Battleship, etc., can be defined similarly

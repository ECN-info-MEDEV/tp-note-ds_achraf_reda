/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.bataillenavale;

import java.util.List;

/**
 *
 * @author USER
 */
public class GameGrid {
    private final int size;
    private char[][] grid;
    private List<Ship> ships; // List to keep track of ships

    public GameGrid(int size) {
        this.size = size;
        this.grid = new char[size][size];
        initializeGrid();
    }

    private void initializeGrid() {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = '~'; // '~' represents water
            }
        }
    }

     public void displayGrid() {
        System.out.print("  "); // Indent for column numbers
        for (int col = 0; col < size; col++) {
            System.out.print((char) ('A' + col) + " "); // Display column headers A, B, C, etc.
        }
        System.out.println(); // New line after the column headers

        for (int row = 0; row < size; row++) {
            System.out.print((row + 1) + " "); // Display row numbers 1, 2, 3, etc.
            for (int col = 0; col < size; col++) {
                System.out.print(grid[row][col] + " "); // Display the grid content
            }
            System.out.println(); // New line after each row
        }
    }
     public void placeShip(Ship ship) {
        if (canPlaceShip(ship)) {
            ships.add(ship); // Add the ship to the list
            // Rest of the code remains the same
        } else {
            throw new IllegalArgumentException("Cannot place ship at the specified location.");
        }
    }
     public boolean canPlaceShip(Ship ship) {
        int row = ship.startPosition[0];
        int column = ship.startPosition[1];

        // Check if the ship fits within the grid bounds and doesn't overlap with other ships
        for (int i = 0; i < ship.getLength(); i++) {
            int currentRow = ship.isHorizontal() ? row : row + i;
            int currentColumn = ship.isHorizontal() ? column + i : column;

            if (currentRow >= size || currentColumn >= size || grid[currentRow][currentColumn] != '~') {
                return false; // Ship placement is not possible
            }
        }
        return true;
    }

public char fireShot(int row, int column) {
        if (grid[row][column] == 'S') {
            grid[row][column] = 'H'; // Mark the hit on the ship
            // Find which ship was hit
            for (Ship ship : ships) {
                if (ship.isHit(row, column)) {
                    if (isShipSunk(ship)) {
                        updateSunkShip(ship);
                        ship.setSunk(true); // Mark the ship as sunk
                        return 'S'; // A ship has been sunk
                    }
                    return 'H'; // It's a hit
                }
            }
        } else {
            grid[row][column] = 'M'; // Mark the miss
            return 'M'; // It's a miss
        }
        return '?'; // This shouldn't happen, indicates an error
    }
public boolean isShipSunk(Ship ship) {
        int hits = 0; // Count the number of hits on the ship
        for (int i = 0; i < ship.getLength(); i++) {
            int row = ship.isHorizontal() ? ship.getStartRow() : ship.getStartRow() + i;
            int column = ship.isHorizontal() ? ship.getStartColumn() + i : ship.getStartColumn();
            if (grid[row][column] == 'H') {
                hits++;
            }
        }
        return hits == ship.getLength();
    }

     public void updateSunkShip(Ship ship) {
        for (int i = 0; i < ship.getLength(); i++) {
            int row = ship.isHorizontal() ? ship.getStartRow() : ship.getStartRow() + i;
            int column = ship.isHorizontal() ? ship.getStartColumn() + i : ship.getStartColumn();
            grid[row][column] = 'X'; // Mark the sunk ship with 'X'
        }
    }

     public boolean areAllShipsSunk() {
        for (Ship ship : ships) { // Assuming there's a list of ships called 'ships'
            if (!ship.isSunk()) {
                return false; // If any ship is not sunk, return false
            }
        }
        return true; // All ships are sunk
    }
    // Additional methods like updating the grid will be added later
}

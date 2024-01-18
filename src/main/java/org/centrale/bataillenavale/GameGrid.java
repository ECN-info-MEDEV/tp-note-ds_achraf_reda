/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.bataillenavale;

/**
 *
 * @author USER
 */
public class GameGrid {
    private final int size;
    private char[][] grid;

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
     public boolean canPlaceShip(Ship ship) {
        int row = ship.startPosition[0];
        int column = ship.startPosition[1];

        // Check if the ship fits within the grid bounds and doesn't overlap with other ships
        for (int i = 0; i < ship.getLength(); i++) {
            int currentRow = ship.isHorizontal ? row : row + i;
            int currentColumn = ship.isHorizontal ? column + i : column;

            if (currentRow >= size || currentColumn >= size || grid[currentRow][currentColumn] != '~') {
                return false; // Ship placement is not possible
            }
        }
        return true;
    }

    public void placeShip(Ship ship) {
        if (canPlaceShip(ship)) {
            int row = ship.startPosition[0];
            int column = ship.startPosition[1];

            for (int i = 0; i < ship.getLength(); i++) {
                int currentRow = ship.isHorizontal ? row : row + i;
                int currentColumn = ship.isHorizontal ? column + i : column;

                grid[currentRow][currentColumn] = 'S'; // 'S' represents a ship
            }
        } else {
            throw new IllegalArgumentException("Cannot place ship at the specified location.");
        }
    }

    // Additional methods like updating the grid will be added later
}

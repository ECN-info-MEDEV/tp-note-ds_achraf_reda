/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.bataillenavale;
import java.util.Scanner;
/**
 *
 * @author USER
 */

public class BattleshipGame {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GameGrid player1Grid = new GameGrid(10);
        GameGrid player2Grid = new GameGrid(10);
        
        // Place ships for both players here (omitted for brevity)

        boolean player1Turn = true; // Player 1 starts the game
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("Player " + (player1Turn ? "1" : "2") + "'s turn.");
            GameGrid currentGrid = player1Turn ? player2Grid : player1Grid; // Choose the grid to attack
            
            // Get player input for firing coordinates
            System.out.print("Enter coordinates to fire (e.g., A5): ");
            String input = scanner.nextLine();
            int[] coordinates = convertInputToCoordinates(input);
            
            // Check the shot and update the grid accordingly
            char result = currentGrid.fireShot(coordinates[0], coordinates[1]);
            
            // Display results and switch turns
            if (result == 'H') {
                System.out.println("Hit!");
            } else if (result == 'M') {
                System.out.println("Miss!");
            } else if (result == 'S') {
                System.out.println("You've sunk a ship!");
            }
            
            currentGrid.displayGrid();

            // Check if all ships are sunk to end the game
            if (currentGrid.areAllShipsSunk()) {
                System.out.println("Player " + (player1Turn ? "1" : "2") + " wins!");
                gameRunning = false;
            }

            player1Turn = !player1Turn; // Switch turn
        }

        scanner.close();
    }

    private static int[] convertInputToCoordinates(String input) {
        // Implement conversion logic here
        // Placeholder return
        return new int[]{0, 0};
    }
}



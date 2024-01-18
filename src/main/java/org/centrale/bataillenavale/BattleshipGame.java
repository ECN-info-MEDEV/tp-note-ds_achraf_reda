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
        
        // Place ships for both players here (omitted for brevity)

        boolean player1Turn = true; // Player 1 starts the game
        boolean gameRunning = true;
        System.out.println("Player 1, place your ships on the grid:");
        GameGrid player1Grid = setupPlayerGrid(scanner);
        player1Grid.displayGrid(); // Show Player 1's grid with ships

        System.out.println("Player 2, place your ships on the grid:");
        GameGrid player2Grid = setupPlayerGrid(scanner);
        player2Grid.displayGrid(); // Show Player 2's grid with ships

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
private static GameGrid setupPlayerGrid(Scanner scanner) {
    GameGrid grid = new GameGrid(10);

    // Example ship placement; repeat this for all required ships
    System.out.println("Place your Aircraft Carrier (5 spaces):");
    placeShip(scanner, grid, new AircraftCarrier(3, 1, true));

    
    // ... repeat for other ships ...

    return grid;
}
private static void placeShip(Scanner scanner, GameGrid grid, Ship ship) {
    boolean placedSuccessfully = false;
    while (!placedSuccessfully) {
        System.out.print("Enter the starting coordinate (e.g., A1): ");
        String startCoord = scanner.nextLine();
        int[] start = convertInputToCoordinates(startCoord);

        System.out.print("Enter orientation (H for horizontal, V for vertical): ");
        String orientationInput = scanner.nextLine();
        boolean isHorizontal = orientationInput.trim().equalsIgnoreCase("H");

        ship.setStartPosition(start[0], start[1], isHorizontal);

        if (grid.canPlaceShip(ship)) {
            grid.placeShip(ship);
            grid.displayGridWithShips();
            placedSuccessfully = true;
        } else {
            System.out.println("Invalid placement. Please try again.");
        }
    }
    grid.displayGrid();
}
    private static int[] convertInputToCoordinates(String input) {
        // Implement conversion logic here
        // Placeholder return
        return new int[]{0, 0};
    }
}



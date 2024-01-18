/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.bataillenavale;

/**
 *
 * @author USER
 */
public class BattleshipGame {
    public static void main(String[] args) {
        GameGrid grid = new GameGrid(10); // Let's assume a larger grid for these ships

        // Create ships
        AircraftCarrier carrier = new AircraftCarrier(0, 0, true); // Starting at A1, horizontal
        Battleship battleship = new Battleship(2, 2, false); // Starting at C3, vertical
        Destroyer destroyer = new Destroyer(4, 4, true); // Starting at E5, horizontal

        // Place ships on the grid
        grid.placeShip(carrier);
        grid.placeShip(battleship);
        grid.placeShip(destroyer);

        // Display the grid with ships placed
        grid.displayGrid();
    }
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.bataillenavale;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class BattleshipGameTest {
    
    public BattleshipGameTest() {
    }

   

    /**
     * Example test for the convertInputToCoordinates method.
     */
    @Test
    public void testConvertInputToCoordinates() {
        System.out.println("convertInputToCoordinates");
        String input = "A1";
        int[] expected = {0, 0}; // Assuming A1 corresponds to {0, 0}
        int[] result = BattleshipGame.convertInputToCoordinates(input);
        assertArrayEquals(expected, result);
    }

    /**
     * Example test for the placeShip method in GameGrid class.
     */
    @Test
    public void testPlaceShip() {
        System.out.println("placeShip");
        GameGrid grid = new GameGrid(10);
        Ship ship = new Destroyer(3); // Assuming the destroyer size is 3
        ship.setStartPosition(0, 0);
        ship.setIsHorizontal(true);
        grid.placeShip(ship);
        // Verify the ship placement on the grid
        assertEquals('S', grid.getGrid()[0][0]);
        assertEquals('S', grid.getGrid()[0][1]);
        assertEquals('S', grid.getGrid()[0][2]);
    }

    /**
     * Example test for the fireShot method in GameGrid class.
     */
    @Test
    public void testFireShot() {
        System.out.println("fireShot");
        GameGrid grid = new GameGrid(10);
        Ship ship = new Destroyer(3);
        ship.setStartPosition(0, 0);
        ship.setIsHorizontal(true);
        grid.placeShip(ship);
        char result = grid.fireShot(0, 0); // Fire at the ship's position
        assertEquals('H', result); // Expecting a hit
    }

    // Add more test methods as needed...
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.bataillenavale;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author USER
 */
public class GameGridTest {
    
    public GameGridTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of displayGrid method, of class GameGrid.
     */
    @Test
    public void testDisplayGrid() {
        System.out.println("displayGrid");
        GameGrid instance = null;
        instance.displayGrid();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeShip method, of class GameGrid.
     */
    @Test
    public void testPlaceShip() {
        System.out.println("placeShip");
        Ship ship = null;
        GameGrid instance = null;
        instance.placeShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canPlaceShip method, of class GameGrid.
     */
    @Test
    public void testCanPlaceShip() {
        System.out.println("canPlaceShip");
        Ship ship = null;
        GameGrid instance = null;
        boolean expResult = false;
        boolean result = instance.canPlaceShip(ship);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayGridWithShips method, of class GameGrid.
     */
    @Test
    public void testDisplayGridWithShips() {
        System.out.println("displayGridWithShips");
        GameGrid instance = null;
        instance.displayGridWithShips();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fireShot method, of class GameGrid.
     */
    @Test
    public void testFireShot() {
        System.out.println("fireShot");
        int row = 0;
        int column = 0;
        GameGrid instance = null;
        char expResult = ' ';
        char result = instance.fireShot(row, column);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isShipSunk method, of class GameGrid.
     */
    @Test
    public void testIsShipSunk() {
        System.out.println("isShipSunk");
        Ship ship = null;
        GameGrid instance = null;
        boolean expResult = false;
        boolean result = instance.isShipSunk(ship);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateSunkShip method, of class GameGrid.
     */
    @Test
    public void testUpdateSunkShip() {
        System.out.println("updateSunkShip");
        Ship ship = null;
        GameGrid instance = null;
        instance.updateSunkShip(ship);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of areAllShipsSunk method, of class GameGrid.
     */
    @Test
    public void testAreAllShipsSunk() {
        System.out.println("areAllShipsSunk");
        GameGrid instance = null;
        boolean expResult = false;
        boolean result = instance.areAllShipsSunk();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayHitsAndMisses method, of class GameGrid.
     */
    @Test
    public void testDisplayHitsAndMisses() {
        System.out.println("displayHitsAndMisses");
        GameGrid instance = null;
        instance.displayHitsAndMisses();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

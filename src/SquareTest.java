import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Tester class for Square.java.
 */
public class SquareTest {
    Square square = null;

    /**
     * Default constructor test case.
     * 1. Tests that inputted values are stored correctly inside the created object.
     */
    @Test
    public void defaultConstructor_Test() {
        square = new Square(4, "square1");
        assertTrue(square.getName().equals("square1"));
        assertTrue(square.getLength() == 4);
    }

    /**
     * Tests the functionality of the getLength method.
     * 1. Tests that the expected length is in fact correctly stored in the object.
     */
    @Test
    public void getLength() {
        square = new Square(4, "square1");
        assertTrue(square.getLength() == 4);
    }

    /**
     * Tests the functionality of the setLength method.
     * 1. Tests that an exception is thrown when an invalid length is entered.
     * 2. Tests that no exception is thrown when a valid length is entered.
     */
    @Test(expected = InvalidParameterException.class)
    public void setLength() {
        square = new Square(-1, "square1");
        square = new Square(4, "square1");
        assertTrue(square.getLength() == 4);
    }

    /**
     * Tests the functionality of the getArea method.
     * 1. Tests that the output of the method matches the expected result.
     */
    @Test
    public void getArea() {
        square = new Square(4, "square1");
        assertTrue(square.getArea() == 16);
    }

    /**
     * Tests the functionality of the getName method.
     * 1. Tests that the expected name string is in fact correctly stored in the object.
     */
    @Test
    public void getName() {
        square = new Square(4, "square1");
        assertEquals("square1", square.getName());
    }

    /**
     * Tests the override method for equals().
     * 1. Creates 2 identical objects and confirms that 'true' is returned.
     * 2. Alters one of the objects and confirms that 'false' is returned.
     */
    @Test
    public void testEquals() {
        square = new Square(4, "square1");
        Square squareDup = new Square(4, "square1");
        assertTrue(square.equals(squareDup));
        squareDup = new Square(2, "square1");
        assertFalse(square.equals(squareDup));
    }

    /**
     * Tests the override method for toString().
     * 1. Compares an expected output with the actual output of the method.
     */
    @Test
    public void testToString() {
        square = new Square(4, "square1");
        assertEquals("Square [Name: square1, Length: 4.0]", square.toString());
    }
}
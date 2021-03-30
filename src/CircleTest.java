import org.junit.Test;

import java.security.CryptoPrimitive;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Tester class for Circle.java.
 */
public class CircleTest {
    Circle circle = null;

    /**
     * Default constructor test case.
     * 1. Tests that inputted values are stored correctly inside the created object.
     */
    @Test
    public void defaultConstructor_Test() {
        circle = new Circle(4, "circle1");
        assertTrue(circle.getName().equals("circle1"));
        assertTrue(circle.getRadius() == 4);
    }

    /**
     * Tests the functionality of the getRadius method.
     * 1. Tests that the expected radius is in fact correctly stored in the object.
     */
    @Test
    public void getRadius() {
        circle = new Circle(4, "circle1");
        assertTrue(circle.getRadius() == 4);
    }

    /**
     * Tests the functionality of the setRadius method.
     * 1. Confirms that negative radius values result in an exception being thrown.
     * 2. Confirms that valid radius values are correctly stored in the object.
     */
    @Test(expected = InvalidParameterException.class)
    public void setRadius() {
        circle = new Circle(-1, "circle1");
        circle = new Circle(4, "circle1");
        assertTrue(circle.getRadius() == 4);
    }

    /**
     * Tests the functionality of the getName method.
     * 1. Tests that the expected name string is in fact correctly stored in the object.
     */
    @Test
    public void getName() {
        circle = new Circle(4, "circle1");
        assertTrue(circle.getName().equals("circle1"));
    }

    /**
     * Tests the functionality of the getArea method.
     * 1. Tests that the output of the method matches the expected result.
     */
    @Test
    public void getArea() {
        circle = new Circle(4, "circle1");
        assertTrue(circle.getArea() == 50.26548245743669);
    }

    /**
     * Tests the override method for equals().
     * 1. Creates 2 identical objects and confirms that 'true' is returned.
     * 2. Alters one of the objects and confirms that 'false' is returned.
     */
    @Test
    public void testEquals() {
        circle = new Circle(4, "circle1");
        Circle circleDup = new Circle(4, "circle1");
        assertTrue(circle.equals(circleDup));
        circleDup = new Circle(2, "circle1");
        assertFalse(circle.equals(circleDup));
    }

    /**
     * Tests the override method for toString().
     * 1. Compares an expected output with the actual output of the method.
     */
    @Test
    public void testToString() {
        circle = new Circle(4, "circle1");
        assertEquals("Circle [Name: circle1, Radius: 4.0]", circle.toString());
    }
}
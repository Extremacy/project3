import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Tester class for Cylinder.java.
 */
public class CylinderTest {
    Cylinder cylinder = null;

    /**
     * Default constructor test case.
     * 1. Tests that inputted values are stored correctly inside the created object.
     */
    @Test
    public void defaultConstructor_Test() {
        cylinder = new Cylinder(10, 4, "cylinder1");
        assertTrue(cylinder.getName().equals("cylinder1"));
        assertTrue(cylinder.getRadius() == 4);
        assertTrue(cylinder.getHeight() == 10);
    }

    /**
     * Tests the functionality of the getVolume method.
     * 1. Tests that the output of the method matches the expected result.
     */
    @Test
    public void getVolume() {
        cylinder = new Cylinder(10, 4, "cylinder1");
        assertTrue(cylinder.getVolume() == 502.65482457436691815402294132472);
    }

    /**
     * Tests the override method for equals().
     * 1. Creates 2 identical objects and confirms that 'true' is returned.
     * 2. Alters one of the objects and confirms that 'false' is returned.
     */
    @Test
    public void testEquals() {
        cylinder = new Cylinder(10, 4, "cylinder1");
        Cylinder cylinderDup = new Cylinder(10, 4, "cylinder1");
        assertTrue(cylinder.equals(cylinderDup));
        cylinderDup = new Cylinder(5, 4, "cylinder1");
        assertFalse(cylinder.equals(cylinderDup));
    }

    /**
     * Tests the override method for toString().
     * 1. Compares an expected output with the actual output of the method.
     */
    @Test
    public void testToString() {
        cylinder = new Cylinder(10, 4, "cylinder1");
        assertEquals("Cylinder [Name: cylinder1, Height: 10.0, Radius: 4.0]", cylinder.toString());
    }
}
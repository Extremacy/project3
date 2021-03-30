import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Tester class for Circle.java.
 */
public class SphereTest {
    Sphere sphere = null;

    /**
     * Default constructor test case.
     * 1. Tests that inputted values are stored correctly inside the created object.
     */
    @Test
    public void defaultConstructor_Test() {
        sphere = new Sphere(4, "sphere1");
        assertTrue(sphere.getName().equals("sphere1"));
        assertTrue(sphere.getRadius() == 4);
    }

    /**
     * Tests the functionality of the getVolume method.
     * 1. Tests that the output of the method matches the expected result.
     */
    @Test
    public void getVolume() {
        sphere = new Sphere(4, "sphere1");
        System.out.println(sphere.getVolume());
        assertTrue(sphere.getVolume() == 268.082573106329);
    }

    /**
     * Tests the override method for toString().
     * 1. Compares an expected output with the actual output of the method.
     */
    @Test
    public void testToString() {
        sphere = new Sphere(4, "sphere1");
        assertEquals("Sphere [Name: sphere1, Radius: 4.0]", sphere.toString());
    }
}
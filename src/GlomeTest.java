import org.junit.Test;

import static org.junit.Assert.*;

public class GlomeTest {
    Glome glome = null;

    /**
     * Default constructor test case.
     * 1. Tests that inputted values are stored correctly inside the created object.
     */
    @Test
    public void defaultConstructor_Test() {
        glome = new Glome(4, "glome1");
        assertTrue(glome.getName().equals("glome1"));
        assertTrue(glome.getRadius() == 4);
    }

    /**
     * Tests the functionality of the getVolume method.
     * 1. Tests that the output of the method matches the expected result.
     */
    @Test
    public void getVolume() {
        glome = new Glome(4, "glome1");
        assertTrue(glome.getVolume() == 1263.3093633394379032108148479841);
    }

    /**
     * Tests the override method for toString().
     * 1. Compares an expected output with the actual output of the method.
     */
    @Test
    public void testToString() {
        glome = new Glome(4, "glome1");
        assertEquals("Glome [Name: glome1, Radius: 4.0]", glome.toString());
    }
}
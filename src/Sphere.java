/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the Sphere object.
 */
public class Sphere extends Circle implements Volume{

    /**
     * Default constructor for the Sphere object.
     * @param radius the radius of the sphere.
     * @param name the name of the sphere.
     */
    public Sphere(double radius, String name) {
        super(radius, name);
    }

    /**
     * Implementation of the Volume method.
     * @return the volume of the sphere ((4/3) * π * r^3)
     */
    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.getRadius(), 3);
    }

    /**
     * Override method of the toString method.
     * @return a formatted string showing the details of a sphere object.
     */
    @Override
    public String toString() {
        return String.format("Sphere [Name: %s, Radius: %.1f]", this.getName(), this.getRadius());
    }
}

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the cylinder object.
 */
public class Cylinder extends Circle implements Volume{
    private double height;

    /**
     * Default constructor for the Cylinder object.
     * @param height the height of the cylinder.
     * @param radius the radius of the base of the cylinder.
     * @param name the name of the cylinder.
     */
    public Cylinder(double height, double radius, String name) {
        super(radius, name);
        this.height = height;
    }

    /**
     * Implementation of the volume method
     * @return the volume of a cylinder (π * r^2 * h)
     */
    @Override
    public double getVolume() {
        return (Math.PI) * Math.pow(this.getRadius(), 2) * height;
    }

    /**
     * Override method for the equals method.
     * @param o the object being compared.
     * @return the boolean representation of the comparison.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cylinder)) {
            return false;
        }
        Cylinder c = (Cylinder) o;
        return super.equals(c) &&
               this.height == height;
    }

    /**
     * Override method for the toString method.
     * @return a formatted string showing the details of the cylinder.
     */
    @Override
    public String toString() {
        return String.format("Cylinder [Name: %s, Height: %.1f, Radius: %.1f]", this.getName(), height, this.getRadius());
    }
}

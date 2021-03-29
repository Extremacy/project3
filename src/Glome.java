/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the Glome object.
 */
public class Glome extends Sphere implements Volume {

    /**
     * Default constructor for the Glome object.
     * @param radius the radius of the glome.
     * @param name the name of the glome.
     */
    public Glome(double radius, String name) {
        super(radius, name);
    }

    /**
     * Implementation of the volume method.
     * @return the volume of the glome (0.5 * π^2 * r^4)
     */
    @Override
    public double getVolume() {
        return 0.5 * Math.pow(Math.PI, 2) * Math.pow(this.getRadius(), 4);
    }

    /**
     * Override method for the toString method.
     * @return a formatted string showing the details of a glome object.
     */
    @Override
    public String toString() {
        return String.format("Glome [Name: %s, Radius: %.1f]", this.getName(), this.getRadius());
    }
}

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the Circle object and implements the area method
 */
public class Circle extends Shape implements Area {
    private double radius;

    /**
     * Workhorse constructor for the Circle object
     * @param radius the radius of the circle object being created.
     * @param name the name of the circle object being created.
     */
    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    /**
     * Getter method for the radius of the circle.
     * @return the radius of the circle.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Override method for the getName abstract method from Shape.java.
     * @return the name of the given circle object.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Override method for the area method from Area.java.
     * @return the area of a circle. (π * r^2)
     */
    @Override
    public double getArea() {
        return (Math.PI) * Math.pow(radius, 2);
    }

    /**
     * Override method for equals
     * @param o the object being compared.
     * @return the boolean expression comparing the two objects.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }

        Circle c = (Circle) o;
        return super.equals(c) && c.radius == radius;
    }

    /**
     * Override for the toString method.
     * @return a formatted string showing the details of the circle object.
     */
    @Override
    public String toString() {
        return String.format("Circle [Name: %s, Radius: %.1f]", this.getName(), radius);
    }
}

import java.security.InvalidParameterException;

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the Square object.
 */
public class Square extends Shape implements Area {
    private double length;

    /**
     * Default constructor for the Square object.
     *
     * @param length the side length of the square.
     * @param name   the name of the square.
     */
    public Square(double length, String name) {
        super(name);
        this.setLength(length);
    }

    /**
     * Setter method for length.
     * @param length the length of the square (must be >= 0)
     */
    public void setLength(double length) {
        if (length >= 0) {
            this.length = length;
        } else {
            throw new InvalidParameterException("The length entered is invalid (" + length + ")");
        }
    }

    /**
     * Getter method for the length of a Square object.
     * @return the side length of a given Square object.
     */
    public double getLength() {
        return length;
    }

    /**
     * Override method for the getArea method.
     * @return the area of a square (l^2)
     */
    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    /**
     * Override method for the getName method.
     * @return the name of the square.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Override for the equals method.
     * @param o the object being compared.
     * @return the boolean representation of the comparison.
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square)) {
            return false;
        }
        Square s = (Square) o;

        return s.getName().equals(name) &&
               s.getLength() == length;
    }

    /**
     * Overrides the toString method
     * @return a formatted string showing the details of the square object.
     */
    @Override
    public String toString() {
        return String.format("Square [Name: %s, Length: %.1f]", this.getName(), length);
    }
}

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 *
 */
public class Square extends Shape implements Area{
    private double length;

    public Square(double length, String name) {
        super(name);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square)) {
            return false;
        }
        Square s = (Square) o;

        return super.equals(s) &&
               this.length == length;
    }

    @Override
    public String toString() {
        return String.format("Square [Name: %s, Length: %.1f]", this.getName(), length);
    }
}

/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 *
 */
public class Cube extends Square implements Volume {

    public Cube(double length, String name) {
        super(length, name);
    }

    @Override
    public double getVolume() {
        return Math.pow(this.getLength(), 3);
    }

    @Override
    public String toString() {
        return String.format("Cube [Name: %s, Length: %.1f]", this.getName(), this.getLength());
    }
}

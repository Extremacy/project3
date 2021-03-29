/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 *
 */
public class Glome extends Sphere implements Volume {

    public Glome(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double getVolume() {
        return 0.5 * Math.pow(Math.PI, 2) * Math.pow(this.getRadius(), 4);
    }

    @Override
    public String toString() {
        return String.format("Glome [Name: %s, Radius: %.1f]", this.getName(), this.getRadius());
    }
}

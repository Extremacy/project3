/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 *
 */
public class Sphere extends Circle implements Volume{

    public Sphere(double radius, String name) {
        super(radius, name);
    }

    @Override
    public double getVolume() {
        return (4.0/3.0) * Math.PI * Math.pow(this.getRadius(), 3);
    }

    @Override
    public String toString() {
        return String.format("Sphere [Name: %s, Radius: %.1f]", this.getName(), this.getRadius());
    }
}

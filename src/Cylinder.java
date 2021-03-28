public class Cylinder extends Circle implements Volume{
    private double height;

    public Cylinder(double height, double radius, String name) {
        super(radius, name);
        this.height = height;
    }

    @Override
    public double getVolume() {
        return (Math.PI) * Math.pow(this.getRadius(), 2) * height;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cylinder)) {
            return false;
        }
        Cylinder c = (Cylinder) o;
        return super.equals(c) &&
               this.height == height;
    }

    @Override
    public String toString() {
        return String.format("Cylinder [Name: %s, Height: %.1f, Radius: %.1f]", this.getName(), height, this.getRadius());
    }
}

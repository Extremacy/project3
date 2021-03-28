public class Circle extends Shape implements Area {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius, String name) {
        super(name);
        this.radius = radius;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getArea() {
        return (Math.PI) * Math.pow(radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle)) {
            return false;
        }

        Circle c = (Circle) o;
        return super.equals(c) && c.radius == radius;
    }

    @Override
    public String toString() {
        return String.format("Circle [Name: %s, Radius: %.1f]", this.getName(), radius);
    }
}

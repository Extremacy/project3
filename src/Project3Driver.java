public class Project3Driver {
    public static void main(String[] args) {
        Circle circle = new Circle(4, "Circle1");
        Square square = new Square(4, "Square1");
        Cylinder cylinder = new Cylinder(10, 4, "Cylinder1");
        Sphere sphere = new Sphere(4, "Sphere1");
        Cube cube = new Cube(4, "Cube1");
        Glome glome = new Glome(4, "Glome1");

        //Testing toString() functionality.
        System.out.println(circle.toString());
        System.out.println(square.toString());
        System.out.println(cylinder.toString());
        System.out.println(sphere.toString());
        System.out.println(cube.toString());
        System.out.println(glome.toString());
        System.out.println();

        //Testing area/volume calculations.
        System.out.println("Circle area: " + circle.getArea() + " (Expected: ~50)");
        System.out.println("Square area: " + square.getArea() + " (Expected: 16)");
        System.out.println("Cylinder volume: " + cylinder.getVolume() + " (Expected: ~502)");
        System.out.println("Sphere volume: " + sphere.getVolume() + " (Expected: ~268)");
        System.out.println("Cube volume: " + cube.getVolume() + " (Expected: 64)");
        System.out.println("Glome volume: " + glome.getVolume() + "(Expected: ~1263)");
    }
}

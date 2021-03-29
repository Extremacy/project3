/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 *
 */
public abstract class Shape {
    protected String name;

    abstract public String getName();

    public Shape(String name) {
        this.name = name;
    }
}

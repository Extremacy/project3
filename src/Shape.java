/**
 * Author: PJ Duimstra
 * Date: 3.29.21
 * Defines the Shape object.
 */
public abstract class Shape {
    protected String name;

    /**
     * Abstract method for returning the name of a given Shape object.
     * @return the name of a Shape object.
     */
    abstract public String getName();

    /**
     * Default constructor for the Shape object.
     * @param name the name for the Shape object.
     */
    public Shape(String name) {
        this.name = name;
    }
}

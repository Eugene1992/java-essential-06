package homework02;

/**
 * @author Andrey Telegin.
 */
abstract class Shape {
    protected static final double MAXSIZE = 10000d;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract double getArea();
}

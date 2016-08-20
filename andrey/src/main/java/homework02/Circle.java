package homework02;

/**
 * @author Andrey Telegin
 */
final class Circle extends Ellipse {
    private double radius;

    /**
     * Constructor check a radius to be in the range (0..MAXSIZE). Constructs a circle with given radius and name.
     *
     * @params radius, name
     */
    Circle(double radius, String name) {
        if (radius > 0 && radius < MAXSIZE) {
            this.radius = radius;
            setName(name);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    double getArea() {
        return radius * radius * Math.PI;
    }
}

package homework02;

/**
 * @author Andrey Telegin.
 */

final class Rhombus extends Parallelogram {
    private double side;
    private double h;
    private double alpha;

    Rhombus(double side, double alpha, String name) {
        if (side > 0 && side < MAXSIZE && alpha > 0 && alpha != 90 && alpha < 180) {
            this.side = side;
            this.alpha = alpha;
            this.h = Math.sin(Math.toRadians(alpha)) * side;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return side * h * 0.5;
    }
}

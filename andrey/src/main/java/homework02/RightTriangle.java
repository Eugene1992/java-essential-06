package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 */
final class RightTriangle extends Triangle {
    private double sideA;
    private double sideB;

    RightTriangle(double sideA, double sideB, String name) {
        if (sideA > 0 && sideB > 0 && sideA < MAXSIZE && sideB < MAXSIZE) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return 0.5 * sideA * sideB;
    }
}

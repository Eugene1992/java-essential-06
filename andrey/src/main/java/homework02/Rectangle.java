package homework02;

/**
 * @author Andrey Telegin.
 */
class Rectangle extends Parallelogram {
    private double sideA;
    private double sideB;

    /**
     * Overloaded constructor Rectangle().
     */
    Rectangle() {

    }

    /**
     * Constructor Rectangle creates rectangle with a given sides and name.
     *
     * @param sideA,sideB,name Sides and name for a new rectangle.
     */
    Rectangle(double sideA, double sideB, String name) {
        if (sideA != sideB && sideA > 0 && sideB > 0 && sideA < MAXSIZE) {
            this.sideA = sideA;
            this.sideB = sideB;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return sideA * sideB;
    }
}

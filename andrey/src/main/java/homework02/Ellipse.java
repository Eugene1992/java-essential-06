package homework02;

/**
 * @author Andrey Telegin.
 */
class Ellipse extends Shape {
    private double semiAxisA;
    private double semiAxisB;

    /**
     * Overloaded constructor Ellipse().
     */
    Ellipse() {
    }

    Ellipse(double semiAxisA, double semiAxisB, String name) {
        if (semiAxisB > 0 && semiAxisA > 0 && semiAxisA < MAXSIZE && semiAxisB < MAXSIZE) {
            this.semiAxisA = semiAxisA;
            this.semiAxisB = semiAxisB;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return semiAxisA * semiAxisB * Math.PI;
    }
}

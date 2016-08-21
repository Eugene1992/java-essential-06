package homework02;

/**
 * @author Andrey Telegin.
 */
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    /**
     * Overloaded constructor Triangle().
     */
    Triangle() {
    }

    Triangle(double sideA, double sideB, double sideC, String name) {
        if (triangleExists(sideA, sideB, sideC) && sideA < MAXSIZE && sideB < MAXSIZE && sideC < MAXSIZE) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        double p = 0.5 * (sideA + sideB + sideC);
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }

    /**
     * Method returns true if a triangle with given sides could be created and returns false otherwise.
     *
     * @param sideA,sideB,sideC Sides of a triangle to be created.
     */
    private static boolean triangleExists(double sideA, double sideB, double sideC) {
        boolean result = false;
        if ((sideA < sideC + sideB) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            result = true;
        }
        return result;
    }
}

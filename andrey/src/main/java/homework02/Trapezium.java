package homework02;

/**
 * @author Andrey Telegin
 */
class Trapezium extends Quadrilateral {
    private double sideA;
    private double sideB;
    private double h;

    /**
     * Constructor Trapezium creates trapezium with given parameters sideA, sideB and h.
     *
     * @param sideA,sideB,h,name Sides and name for a new Trapezium.
     */
    Trapezium(double sideA, double sideB, double h, String name) {
        if (sideA != sideB && sideA > 0 && sideB > 0 && sideA * sideB < MAXSIZE * MAXSIZE) {
            this.h = h;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        setName(name);
    }

    @Override
    double getArea() {
        return h * 0.5 * (sideA + sideB);
    }
}

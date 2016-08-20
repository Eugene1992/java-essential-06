package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 *
 */
class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    Triangle(){

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

    static boolean triangleExists(double sideA, double sideB, double sideC) {
        boolean result = false;
        if ((sideA < sideC + sideB) && (sideB < sideC + sideA) && (sideC < sideA + sideB)) {
            result = true;
        }
        return result;
    }
}

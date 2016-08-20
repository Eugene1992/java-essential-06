package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 */
class Parallelogram extends Quadrilateral {
    private double sideA;
    private double sideB;
    private double gamma;
    private double h;

    Parallelogram() {

    }

    Parallelogram(double sideA, double sideB, double gamma, String name) {
        if (sideA != sideB && sideB > 0 && sideA > 0 &&
                sideB < MAXSIZE && sideA < MAXSIZE &&
                gamma > 0 && gamma < 90) {

            this.sideA = sideA;
            this.sideB = sideB;
            this.gamma = gamma;
            this.h = Math.sin(Math.toRadians(gamma)) * sideB;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return sideA * sideB * Math.sin(Math.toRadians(gamma));
    }
}

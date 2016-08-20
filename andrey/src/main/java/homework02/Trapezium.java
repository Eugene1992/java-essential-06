package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 */
class Trapezium extends Quadrilateral {
    //private static final double MAXSIZE = 10000d;
    private double sideA;
    private double sideB;
    private double h;

    /**
     * Constructor Trapezium creates trapezium with given parameters sideA, sideB and h.
     *
     * @param sideA,sideB,h
     */
    Trapezium(double sideA, double sideB, double h, String name) {
        if (sideA != sideB && sideA > 0 && sideB > 0 && sideA * sideB < MAXSIZE * MAXSIZE) {
            setName(name);
            this.h = h;
            /*double sideEdge;
            if (sideB > sideA) {
                sideEdge = Math.sqrt(0.5*0.5*(sideB-sideA)*(sideB-sideA)+h*h);
            } else{
                sideEdge = Math.sqrt(0.5*0.5*(sideA-sideB)*(sideA-sideB)+h*h);
            }
            this.sideC = sideEdge;
            this.sideD = sideEdge;*/
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }

        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    double getArea() {
        return h * 0.5 * (sideA + sideB);
    }
}

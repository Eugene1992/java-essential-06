package homework02;

/**
 * Created by User on 20.08.16.
 * @TODO Javadoc
 */
class Ellipse extends Shape {
    private double semiAxisA;
    private double semiAxisB;

    Ellipse(){

    }

    Ellipse(double semiAxisA, double semiAxisB, String name){
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
        return semiAxisA*semiAxisB*Math.PI;
    }
}

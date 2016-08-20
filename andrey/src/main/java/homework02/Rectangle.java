package homework02;

/**
 * @TODO Javadoc
 * Created by User on 20.08.16.
 */
class Rectangle extends Parallelogram {
    private double sideA;
    private double sideB;

    Rectangle(){

    }

    Rectangle(double sideA, double sideB, String name) {
        if (sideA > 0 && sideB>0 && sideA< MAXSIZE){
            this.sideA = sideA;
            this.sideB = sideB;
        }
        else {
            throw new IllegalArgumentException("Illegal input!");
        }
        this.setName(name);
    }

    @Override
    double getArea(){
        return sideA*sideB;
    }
}

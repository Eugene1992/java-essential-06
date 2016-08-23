package HomeworkTwo;

public class Quadrate extends Quadrilateral {
    public Quadrate(double sideA) {
        super(sideA);
    }


    double areaOfShape() {
        double areaOfQuadrate = sideA * sideA;
        return areaOfQuadrate;
    }
}

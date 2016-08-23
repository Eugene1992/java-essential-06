package HomeworkTwo;

/**
 * Created by ivan on 22.08.16.
 */
public class Rectangle extends Quadrilateral {
    public Rectangle(double sideA, double sideB) {
        super(sideA);
        this.sideB = sideB;
    }

    double sideB;

    double areaOfShape() {
        double areaOfQuadrate = sideB * sideA;
        return areaOfQuadrate;
    }
}

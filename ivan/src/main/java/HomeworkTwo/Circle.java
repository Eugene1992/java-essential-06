package HomeworkTwo;

/**
 * Created by ivan on 22.08.16.
 */
public class Circle extends Circumference {
    public Circle(double radius){
        super(radius);
    }

    double areaOfShape() {
        double areaOfCircle = Math.PI * radius * radius;
        return areaOfCircle;
    }

}

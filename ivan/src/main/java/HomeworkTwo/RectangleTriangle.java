package HomeworkTwo;

public class RectangleTriangle extends Triangle {
    double lagB;
    public RectangleTriangle( double lagA, double lagB) {
        super(lagA);
        this.lagB = lagB;
    }

    double areaOfShape() {
        double areaOfRecTriangle = (lagB * lagA)/2;
        return areaOfRecTriangle;
    }
}

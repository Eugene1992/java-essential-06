package HomeworkTwo;


public class Areas {
    Circle circle = new Circle(4.5);
    EquilateralTriangle eTriangl = new EquilateralTriangle(3.4);
    RectangleTriangle rTriangl = new RectangleTriangle(3.5, 5.6);
    Quadrate quadrate = new Quadrate(6.5);
    Rectangle rectangle = new Rectangle(2.5, 9.7);

    public double[] arrayArea = new double[5];{
        arrayArea[0] = circle.areaOfShape();
        arrayArea[1] = eTriangl.areaOfShape();
        arrayArea[2] = rTriangl.areaOfShape();
        arrayArea[3] = quadrate.areaOfShape();
        arrayArea[4] = rectangle.areaOfShape();
    }

    public static double  maxArea(double[] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}





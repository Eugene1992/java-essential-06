package homework02;

/**
 * @TODO Javadoc, print out
 *
 * Created by User on 21.08.16.
 */
class ShapeExec {
    //Shape[] arrayOfShape;
    void start() {
        Shape[] arrayOfShape = new Shape[9];
        initArrOfShapes(arrayOfShape);
        printArrayOfShapes(arrayOfShape);
        sortByArea(arrayOfShape);
        printArrayOfShapes(arrayOfShape);
    }

    static void initArrOfShapes(Shape[] arrShape) {
        Shape smallSquare = new Square(40.5, "Small Square");
        arrShape[0] = smallSquare;
        Shape bigSquare = new Square(100.9, "Big Square");
        arrShape[1] = bigSquare;
        Shape ellipse = new Ellipse(12.3, 34.1, "Ellipse");
        arrShape[2] = ellipse;
        Shape romb = new Rhombus(34.1, 36.6, "Rombik");
        arrShape[3] = romb;
        Shape rect = new Rectangle(11.9, 55.6, "Rectangle");
        arrShape[4] = rect;
        Shape pgram = new Parallelogram(17.5, 19.43, 45, "Parallelogram P-GRAM");
        arrShape[5] = pgram;
        Shape circle = new Circle(18.3, "Circle");
        arrShape[6] = circle;
        Shape triRight = new RightTriangle(13.9, 22.45, "Right Triangle");
        arrShape[7] = triRight;
        Shape tri = new Triangle(50.2, 33.1, 49.2, "Regular Triangle");
        arrShape[8] = tri;

        /*Shape[] temp= {smallSquare, bigSquare, ellipse, romb, rect, pgram, circle, triRight, tri};
        arrShape = temp;*/
    }

    private static void sortByArea(Shape[] arrayOfShape) {
        int len = arrayOfShape.length;
        for (int j = 0; j < len - 1; j++) {
            for (int i = 0; i < len - 1; i++) {
                if (arrayOfShape[i + 1].getArea() > arrayOfShape[i].getArea()) {
                    Shape temp = arrayOfShape[i + 1];
                    arrayOfShape[i + 1] = arrayOfShape[i];
                    arrayOfShape[i] = temp;
                }
            }
        }
    }

    private static void printArrayOfShapes(Shape[] arrayOfShape) {
        for (Shape aShape : arrayOfShape) {
            System.out.printf("The area of %s is : \t\t\t\t %10.2f \n", aShape.getName(), aShape.getArea());
        }
    }
}

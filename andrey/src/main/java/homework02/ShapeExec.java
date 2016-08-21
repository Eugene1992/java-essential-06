package homework02;

/**
 * @author Andrey Telegin.
 *         <p>Class creates, initializes, sorts the elements by an area and prints out the array of Shape.</p>
 */
class ShapeExec {
    void start() {
        Shape[] arrayOfShape = new Shape[10];
        initArrOfShapes(arrayOfShape);
        printShapeArray(arrayOfShape);
        sortByArea(arrayOfShape);
        printShapeArray(arrayOfShape);
    }

    /**
     * Method initializes an array of elements of Shape type.
     *
     * @param arrShape input array of Shape.
     */
    private static void initArrOfShapes(Shape[] arrShape) {
        Shape smallSquare = new Square(40.5, "Small Square");
        arrShape[0] = smallSquare;
        Shape bigSquare = new Square(100.9, "Big Square");
        arrShape[1] = bigSquare;
        Shape ellipse = new Ellipse(12.3, 34.1, "Ellipse");
        arrShape[2] = ellipse;
        Shape rhombus = new Rhombus(34.1, 36.6, "Rhombus");
        arrShape[3] = rhombus;
        Shape rect = new Rectangle(11.9, 55.6, "Rectangle");
        arrShape[4] = rect;
        Shape pgram = new Parallelogram(17.5, 19.43, 45, "Parallelogram");
        arrShape[5] = pgram;
        Shape circle = new Circle(18.3, "Circle");
        arrShape[6] = circle;
        Shape triRight = new RightTriangle(13.9, 22.45, "Right Triangle");
        arrShape[7] = triRight;
        Shape tri = new Triangle(50.2, 33.1, 49.2, "Regular Triangle");
        arrShape[8] = tri;
        Shape trapez = new Trapezium(15.6, 24.1, .2, "Regular Triangle");
        arrShape[9] = trapez;

        /*Shape[] temp= {smallSquare, bigSquare, ellipse, rhombus, rect, pgram, circle, triRight, tri};
        arrShape = temp;*/
    }

    /**
     * Method sorts the elements (of type Shape) of an array by their area value.
     *
     * @param arrayOfShape an array of type homework02.Shape to be sorted.
     */
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

    @Deprecated
    private static void printArrayOfShapes(Shape[] arrayOfShape) {
        for (Shape aShape : arrayOfShape) {
            System.out.printf("The area of %s is :\t\t%5.2f\n", aShape.getName(), aShape.getArea());
        }
    }

    /**
     * Prints out the "name", "profit", "assets" and "Forbes list index" fields of a homework01.Company in array
     *
     * @param arrayOfShape An array to be printed
     */
    private static void printShapeArray(Shape[] arrayOfShape) {
        final String LINE = "----------------------------------------------------";
        System.out.println(LINE);
        String nameWithSpaces;
        int maxName = getLongestName(arrayOfShape);
        for (Shape shp : arrayOfShape) {
            nameWithSpaces = shp.getName();
            while (nameWithSpaces.length() < maxName) {
                nameWithSpaces += " ";
            }
            System.out.printf("%s \t %5.2f \n", nameWithSpaces, shp.getArea());
        }
        System.out.println(LINE);
    }

    /**
     * method searches for the longest name in array.
     *
     * @param arrayOfShape an array of type homework02.Shape to be sorted
     * @return maxNameLength int value of a longest name's length
     */
    private static int getLongestName(Shape[] arrayOfShape) {
        int maxNameLength = arrayOfShape[0].getName().length();
        for (Shape shp : arrayOfShape) {
            if (shp.getName().length() > maxNameLength) {
                maxNameLength = shp.getName().length();
            }
        }
        return maxNameLength;
    }
}

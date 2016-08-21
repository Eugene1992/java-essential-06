package homework02;

/**
 * @author Andrey Telegin.
 */
final class Square extends Rectangle {
    /**
     * Square's sides are equal so we only need one.
     */
    private double side;

    Square(double side, String name) {
        if (side > 0 && side < MAXSIZE) {
            this.side = side;
        } else {
            throw new IllegalArgumentException("Illegal input!");
        }
        setName(name);
    }

    @Override
    double getArea() {
        return side * side;
    }
}

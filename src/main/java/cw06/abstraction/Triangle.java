package cw06.abstraction;

/**
 * Created by evgeniy on 22/08/16.
 */
public class Triangle extends Shape {

    public Triangle(String name) {
        super(name);
    }

    protected double getSquare() {
        return 10.0;
    }

    protected double getTotal() {
        return 0;
    }
}

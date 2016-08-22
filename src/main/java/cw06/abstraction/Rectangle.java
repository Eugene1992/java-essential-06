package cw06.abstraction;

/**
 * Created by evgeniy on 22/08/16.
 */
public class Rectangle extends Quadrilateral {

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double getSquare() {
        return 0;
    }
}

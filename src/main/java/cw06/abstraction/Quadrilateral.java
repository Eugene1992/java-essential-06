package cw06.abstraction;

public abstract class Quadrilateral extends Shape {

    public Quadrilateral(String name) {
        super(name);
    }

    @Override
    protected double getTotal() {
        return 10.0;
    }

    protected abstract double getSquare();
}

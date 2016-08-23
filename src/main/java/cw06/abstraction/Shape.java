package cw06.abstraction;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getSquare();

    abstract double getTotal();

    static void staticSomething() {
    }
}

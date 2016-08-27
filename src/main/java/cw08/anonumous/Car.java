package cw08.anonumous;

public class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    public void move() {
        System.out.println(name + " move...");
    }
}

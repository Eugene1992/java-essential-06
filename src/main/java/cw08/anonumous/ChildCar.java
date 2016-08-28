package cw08.anonumous;

public class ChildCar extends Car {

    public ChildCar(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println(name + " car move...");
    }
}

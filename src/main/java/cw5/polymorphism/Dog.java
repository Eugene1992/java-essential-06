package cw5.polymorphism;

/**
 * Created by evgeniy on 19/08/16.
 */
public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Wooof");
    }
}

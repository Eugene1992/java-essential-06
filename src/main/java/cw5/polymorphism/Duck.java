package cw5.polymorphism;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Crewww!");
    }
}

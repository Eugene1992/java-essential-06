package cw05.polymorphism;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        // System.out.println("Meouwww");
        super.speak();
        System.out.println(name);
    }

    @Override
    public Cat getCat() {
        return new Cat("");
    }
}

package cw05.polymorphism;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    protected void speak(){
        System.out.println("Animal speak something...");
    }

    public Animal getCat(){
        return null;
    }
}

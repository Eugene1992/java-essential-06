package cw04.inheritance;

public class Car {
    protected String model;
    protected String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void run(){
        for (int i = 0; i < 10; i++) {
            System.out.print("_");
        }
        System.out.print("@==@");
    }

    void doSomethingByCar(){

    }
}

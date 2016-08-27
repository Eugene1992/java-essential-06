package cw08.anonumous;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes");
        car1.move();

        Car car2 = new Car("Audi"){
            public String color;

            class A {

            }

            @Override
            public void move() {
                color = "as";
                System.out.println(name + " car move...");
            }

            public void k() {

            }
        };
        car2.move();

        ChildCar car3 = new ChildCar("Audi");
        car3.move();
    }
}

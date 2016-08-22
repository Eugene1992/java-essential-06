package cw04.inheritance;

public class Main {
    public static void main(String[] args) {
        Car mercedes1 = new MercedesBenz("Mers", "Black", "star");
        Car mercedes2 = new MercedesBenz("Mers", "Black", "star");
        MercedesStar mercedes3 = new MercedesStar("Mers", "Black", "star");

        // A b = new A();

    }

    static void printMercedeses(MercedesBenz[] mbArr, MercedesStar[] msArr) {

    }

    static void printMercedeses(Car[] carArr) {
        for (Car car : carArr) {
            car.doSomethingByCar();
        }
    }
}

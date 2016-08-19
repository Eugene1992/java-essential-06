package cw4;

import cw4.inheritance.A;
import cw4.inheritance.B;

/**
 * Created by evgeniy on 18/08/16.
 */
public class Main {
    public static void main(String[] args) {
        String someString = "Hello world!";

        System.out.println(someString.substring(5));
        System.out.println(someString.substring(5, 7));

        printArrayOne(new int[]{});
        printArrayTwo(2, 4, 5, 6, 4, 3);

        System.out.println("Hello, " + args[0]);
        System.out.println("Hello, " + args[1]);
        System.out.println("Hello, " + args[2]);

        //A a = new B();
    }

    void doSomething(int k, double d) {

    }

    void doSomething(double d, int k) {

    }

    void doSomething(double d, String s) {

    }

    void doSomething(double d, int k, String l) {

    }

    static void doSomething(double d, int k, double f) {

    }

    static void printArrayOne(int[] arr){
        for (int i = 0; i < arr.length; i++) {

        }
    }

    static void printArrayTwo(int... arr){
        for (int i = 0; i < arr.length; i++) {

        }
    }

}

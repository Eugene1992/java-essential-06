package cw08.anonumous;

import java.util.function.Consumer;

/**
 * Created by evgeniy on 26/08/16.
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf("128");
        Integer i2 = 10;
        Consumer<String> println0 = s -> System.out.print("Hello world!");
        Consumer<String> println1 = System.out::print;


        System.out.println(i1 == i2);

    }
}

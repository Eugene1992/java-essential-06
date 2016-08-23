package cw06.interfaces.with;

import java.util.ArrayList;

public interface Movable {
    public static final int max = 10;

    public abstract int getDistance(int hours);

    default void f(){
        System.out.println("Hello!");
    }

    static void g(){
        System.out.println("Hi!");
    }
}

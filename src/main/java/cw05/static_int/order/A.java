package cw05.static_int.order;

/**
 * Created by evgeniy on 19/08/16.
 */
public class A {
    static {
        System.out.println("Static block A");
    }

    {
        System.out.println("Non-static block A");
    }

    public A() {
        System.out.println("Constructor A");
    }
}

package cw05.static_int;

/**
 * Created by evgeniy on 19/08/16.
 */
class A {
    static {
        a = 10;
        // b = 10;
    }

    {
        //a = 10;
        b = 10;
    }

    public final static int a;
    public int b = 10;

    public A() {
        b = 10;
        //a = 10;
    }

    static void getStatic() {
        //a = 12;
        // b = 10;
    }

    void getNonStatic() {
        //a = 12;
        b = 10;
    }
}

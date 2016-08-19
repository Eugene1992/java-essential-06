package cw5.static_int.order;

/**
 * Created by evgeniy on 19/08/16.
 */
public class B extends A {
    static {
        System.out.println("Static block B");
    }

    {
        System.out.println("Non-static block B");
    }

    public B() {
        System.out.println("Constructor B");
    }
}

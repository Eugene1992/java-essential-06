package cw05.static_int.order;

/**
 * Created by evgeniy on 19/08/16.
 */
public class C extends B {
    static {
        System.out.println("Static block C");
    }

    {
        System.out.println("Non-static block C");
    }

    public C() {
        System.out.println("Constructor C");
    }
}

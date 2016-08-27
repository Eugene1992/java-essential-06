package cw08.inner;

import java.io.Serializable;

/**
 * - inner non-static(внутренний)
 * - nested static(вложенный)
 * - local
 * - anonymous
 */
public class Ship extends SuperShip {

    private String name;
    protected String proc;
    String pack;
    public String publ;
    private static String stat;

    public Ship(String name) {
        this.name = name;

    }

    public class Engine extends SuperEngine implements Cloneable{
        private String name;

        public String getShipName() {
            doSomething();
            return stat;
        }

        class A extends Engine{

        }
    }

    public void doSomething() {
        int f = 10;
        class LocalClass extends Engine implements Serializable {

            public LocalClass() {
            }
            void k() {
                System.out.println(f);
            }
        }
        LocalClass localClass = new LocalClass();
        System.out.println(super.superShip);
        System.out.println(new Engine().superEngine);
    }

    public void f() {
    }
}

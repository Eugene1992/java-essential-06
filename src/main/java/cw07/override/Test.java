package cw07.override;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        A a1 = new AImpl();
        B a2 = new AImpl();

        A.staticMethod();
        a1.defaultMethod();

        LinkedList<Integer> linkedList = new LinkedList<>();
    }
}

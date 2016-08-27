package cw07;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            al.add(10);
        }
        long stop1 = System.currentTimeMillis();
        System.out.println(stop1 - start1);
        LinkedList<Integer> ll = new LinkedList<>();

        long start2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            ll.add(10);
        }
        long stop2 = System.currentTimeMillis();
        System.out.println(stop2 - start2);
    }
}

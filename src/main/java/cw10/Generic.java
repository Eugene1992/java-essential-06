package cw10;

import java.util.*;

public class Generic {
    public static void main(String[] args) {
//        printNtimes("Hello world", 4);
        printNtimes(10, 4);
//        printNtimes(new Employee("Evgeniy", 2300), 4);
//        Collections.sort();
    }

    static <T extends Number, K> void printNtimes(T content, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(content);

        }
    }


}

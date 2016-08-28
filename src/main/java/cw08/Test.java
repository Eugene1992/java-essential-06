package cw08;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        System.out.println(linkedList);
        System.out.println(linkedList.peek());
        System.out.println(linkedList.poll());
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);
        System.out.println(linkedList.pollLast());
        System.out.println(linkedList);
    }
}
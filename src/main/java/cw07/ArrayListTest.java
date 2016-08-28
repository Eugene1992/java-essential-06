package cw07;

import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(6);
        list1.add(12);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(7);
        list2.add(777);
        list2.addAll(1, list1);
        list2.add(4, list1.get(2));
        System.out.println(list2);

        list2.set(0, 888);
        System.out.println(list2);
        System.out.println("Size: " + list2.size());

        list2.remove(0);
        System.out.println(list2);
        System.out.println("Size: " + list2.size());

        list2.remove(new Integer(12));
        System.out.println(list2);
        System.out.println("Size: " + list2.size());

        boolean remove1 = list2.remove(new Integer(12));
        System.out.println(list2);
        System.out.println("Size: " + list2.size());
        System.out.println(remove1);

        int remove2 = list2.remove(0);
        System.out.println(list2);
        System.out.println("Size: " + list2.size());
        System.out.println(remove2);

        System.out.println(list2.get(0));
        /*list2.clear();
        System.out.println(list2);
        System.out.println("Size: " + list2.size());*/

        System.out.println(list2.contains(10));
        System.out.println(list2.contains(6) + "\n");

        System.out.println(list2);
        System.out.println("Index of 6: " + list2.indexOf(6));
        System.out.println("Index of 777: " + list2.indexOf(777) + "\n");

        System.out.println("Is list2 empty? " + list2.isEmpty() + "\n");

        System.out.println(list2);
        list2.removeAll(Arrays.asList(6, 7));
        System.out.println(list2 + "\n");

        list2.add(0, 3);
        list2.add(0, 8);
        list2.add(0, 21);
        System.out.println(list2);
        System.out.println("Sub list(0, 2): " + list2.subList(0, 2));


    }
}

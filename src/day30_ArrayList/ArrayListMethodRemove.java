package day30_ArrayList;

import java.util.ArrayList;

public class ArrayListMethodRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        boolean r = list.remove("B");
        System.out.println(r);
        System.out.println(list);

        list.clear();
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.indexOf(1));
        System.out.println(list1.indexOf(10));//object does not exist



    }
}

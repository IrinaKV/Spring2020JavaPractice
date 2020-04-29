package day30_ArrayList;

import java.util.ArrayList;

public class MethodRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        //list.remove(1);
        Integer a = 200;
        boolean r = list.remove(a);
        System.out.println(r +""+list);
    }
}

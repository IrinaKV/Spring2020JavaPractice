package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_ContainsAll {
    public static void main(String[] args) {
        ArrayList<Integer>  list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // if 10, 20, 60 obj exist in ArrayList return true

       // Arrays.asList(obj1, obj2,  ...), return Collection type list

        boolean r1 = list.containsAll(Arrays.asList(10, 20, 60));
        System.out.println(r1);

        Integer[] data = {10, 20, 30};
        boolean r2 = list.containsAll(Arrays.asList(data));
        System.out.println(r2);
    }
}

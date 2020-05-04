package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Arrays;

public class Bulk_addAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // add 30, 40, 50, 60, 70, 80 , 45, 7000
        Integer[] arr = {30, 40, 50, 60, 70, 80 , 45, 7000};

        list.addAll(Arrays.asList(arr));
        System.out.println(list);

        list.removeAll((Arrays.asList(80, 45,30)));
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list1);


        //list.retainAll()
    }
}

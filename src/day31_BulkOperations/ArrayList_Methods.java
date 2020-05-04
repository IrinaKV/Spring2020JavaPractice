package day31_BulkOperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Methods {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("B");


        list1.contains("Z");//return booling
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("B");
        list1.add("C");
        list1.equals(list2);

        Collections.sort(list1);
        Collections.sort(list2);
        list1.equals(list2);
        System.out.println("______________________________");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        list3.add(100);
        list3.add(1000);
        list3.add(20);
        Collections.sort(list3);
        ArrayList<Integer> reverslist3 = new ArrayList<>();

        for (int i = list3.size()-1; i >=0 ; i--) {
            //System.out.print(list3.get(i) + " ");
            reverslist3.add(list3.get(i));
        }
        System.out.println(reverslist3);

       boolean r1= list3.isEmpty();
        System.out.println(r1);

        list3.clear();
        boolean r2= list3.isEmpty();
        System.out.println(r2);

    }
}

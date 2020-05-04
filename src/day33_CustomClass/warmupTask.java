package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;

public class warmupTask {
    public static void main(String[] args) {

       /*
        1. write a program that can return the unique objects from a anArray List of Integers
        Ex:
        list: {1,1,2,3,4,5,5}
        sout(list); ==> {2,3,4};
        Note: 1. DO NOT use any extra arrayList
        2. DO NOT use any loops
        3. do not use any sort method
        4. use predicate only and collections methods only
        Hint:   Collections.frequency() // will return the frequency
        removeIf( frequency == 1)  can keep the unique objects in arrayList
        2. write a program that can return the duplicated objects from a an ArrayList of Integers
        Ex:
        list: {1,1,2,3,4,5,5}
        sout(list); ==> {1,1,5,5};
        Note: 1. DO NOT use any extra arrayList
        2. DO NOT use any loops
        3. DO NOT use any sort method
        4. Use predicate and collections methods only
        3. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:
        ex:
        str = "ABCD123$%#@&456EFG!";
        list1: {$, %, #, @, &, !}
        list2: {A, B, C, D, E, F, G}
        list3: {1, 2, 3, 4, 5, 6}
        DO NOT USE LAMBDA
        4. write a program that can extract the sepecial characters, digits and alphebets from a string and stores them into seperate ArrayLists of Character:

        */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,1));
        list.removeIf(p-> Collections.frequency(list,p)>1);//if the freq > 1 then delete
        System.out.println(list);
        System.out.println("------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,5,1));
        list1.removeIf(p-> Collections.frequency(list1,p)==1);

        System.out.println(list1);
        //System.out.println(new LinkedHashMap<>(list1));
    }
}

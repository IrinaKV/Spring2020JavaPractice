package day32_Predicate;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveZero2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,0,2,0, 0, 3,0,4,0));
        System.out.println(list);

       int count = Collections.frequency(list,0);
        System.out.println(count);
        list.removeAll(Arrays.asList(0));
        System.out.println(list);
        for (int i = 0; i < count; i++) {
            list.add(0);
        }
        System.out.println(list);
    }


}

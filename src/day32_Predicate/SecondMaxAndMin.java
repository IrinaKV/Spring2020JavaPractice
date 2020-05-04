package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondMaxAndMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,23,21,90,34,56,67,21,45,90));
        System.out.println(SecondMax(list));
        System.out.println(SecondMin(list));


    }public static int SecondMax(ArrayList<Integer> list){
        Integer max1 = Collections.max(list);
        list.removeAll(Arrays.asList(max1));
        int max = Collections.max(list);
        return max;

    }
    public static int SecondMin(ArrayList<Integer> list){
        Integer min1 = Collections.min(list);
        list.removeAll(Arrays.asList(min1));
        int min = Collections.min(list);
        return min;

    }
}

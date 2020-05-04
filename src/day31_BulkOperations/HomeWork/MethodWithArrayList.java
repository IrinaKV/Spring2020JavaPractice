package day31_BulkOperations.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodWithArrayList {
    public static ArrayList<Integer> removeInst(ArrayList<Integer> r, Integer n)
    {
        do {
            r.remove(n);
        }while(r.contains(n));
        return r;

    }

    public static void main(String[] args)
    {

        ArrayList<Integer>  arr = new ArrayList<>();
        Integer[] nums = new Integer[]{1,1,2,3};
        arr.addAll(Arrays.asList(nums));

        System.out.print(removeInst(arr,1));


    }//end main
}

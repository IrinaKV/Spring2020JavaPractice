package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Help {

        public static ArrayList<Integer> removeInst (ArrayList < Integer > r, Integer n)
        {
            ArrayList<Integer> newr = new ArrayList<Integer>();
            for (Integer each : r) {
                if (each != n) {
                    newr.add(each);
                }
            }
            return newr;
        }
        public static void main (String[]args)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            Integer[] nums = new Integer[]{1, 1, 2, 3};
            arr.addAll(Arrays.asList(nums));
            Integer i = 1;
            System.out.print(removeInst(arr, i));
        }
    }

package day22_Arrats_Loops;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for (int i = arr.length - 1; i>=0; i--){
            int eachNum = arr[i];
            System.out.println(eachNum);
        }
        System.out.println("============================");

        int[] revArr = new int[arr.length];
        int j = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            revArr[i] = arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revArr));
    }
}

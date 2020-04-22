package day22_Arrats_Loops;

import java.util.Arrays;

public class Desending {
    public static void main(String[] args) {
        int[] arr ={10,78, 2, 4, 899};
        Arrays.sort(arr);
        int[]revArr = new int[arr.length];
        int j =arr.length -1;
        for (int i = 0; i < arr.length ; i++) {
            revArr[i] = arr[j];
            j--;

        }
        System.out.println(Arrays.toString(revArr));
    }
}

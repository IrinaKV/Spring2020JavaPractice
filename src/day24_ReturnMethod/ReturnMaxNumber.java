package day24_ReturnMethod;

import java.util.Arrays;

public class ReturnMaxNumber {
    public static int muxNumber(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] arr = {4,5,89,-6,45,-9,58};
        int max = muxNumber(arr);
        System.out.println(max);
    }

}

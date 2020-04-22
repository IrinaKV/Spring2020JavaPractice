package day21_MultudementinalArrays;

import java.util.Arrays;

public class StringMathod {
    public static void main(String[] args) {
        String name = "Java";
        char [] chars = name.toCharArray();
        System.out.println(Arrays.toString(chars));


        String str = "I like Java";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        String sentence = "Today is great day";
        String[] arr1 = sentence.split(" ");
        System.out.println(Arrays.toString(arr1));
        String result = "";

        for (int i = arr1.length-1; i >=0 ; i--) {
          result+= arr1[i] + " ";
        }
        System.out.println(result);

    }
}

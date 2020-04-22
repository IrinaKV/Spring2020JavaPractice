package OfficeHours.Practace15_04;

import java.util.Arrays;

public class StringMathod {
    public static void main(String[] args) {
        String str = "Cybertek";
        char[] ch = str.toCharArray();

        String sentence = "I like to learn java";
        String[] sen= sentence.split(" ");
        System.out.println(Arrays.toString(sen));
        int totalWords = sen.length;
        System.out.println(totalWords);

    }

}

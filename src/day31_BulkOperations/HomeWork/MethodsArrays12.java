package day31_BulkOperations.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArrays12 {
    public static String extractNum(String s) {
        String num = "";
        char[] ch =  s.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            if(Character.isDigit(ch[i])){
                num +=ch[i] +"";
            }
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(extractNum("aa!!%$#.10aa"));

    }
}

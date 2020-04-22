package day16_Loop;

import java.util.Scanner;

public class homeWork_xX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //if(word.charAt(0)=='x' || word.charAt(0)=='X'
        //        || word.charAt(word.length()-1)=='x'|| word.charAt(word.length()-1)=='X')

        if(word.startsWith("x")|| word.startsWith("X")){
           word = word.substring(1);
        }
        if(word.endsWith("x") || word.endsWith("X")){
           word = word.substring(0,word.length()-1);
        }

        System.out.println(word);









    }


}

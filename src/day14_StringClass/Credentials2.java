package day14_StringClass;

import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();

        System.out.println(word1.length());
        System.out.println(word2.length());

        if (word1.compareTo(word2)==0){
            System.out.println("word1 equals word2");
        }else{
            System.out.println("word1 does not equal word2");
        }

    }
}

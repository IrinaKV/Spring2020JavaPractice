package day14_StringClass;

import java.util.Scanner;

public class CombineTwoString2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter second word");
        String word2 = scan.next();

        word1 = word1.substring(1);
        word2 = word2.substring(1);
        String result = word1.concat(" " + word2);
        System.out.println(result);

    }
}

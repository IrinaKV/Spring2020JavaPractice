package day16_Loop;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.nextLine();
        String reverseWord = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverseWord+= word.charAt(i);
        }
        if(reverseWord.equalsIgnoreCase(word)){
            System.out.println(reverseWord);
        }else System.out.println(reverseWord + " is not a palindrom with " + word);
    }
}

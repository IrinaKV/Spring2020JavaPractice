package day14_StringClass;

import java.util.Scanner;

public class HomeWork_WordInSentence {
    /*
    Write a program that will verify if word contains in the sentence. Print out the result as boolean value. /
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();

        if(sentence.contains(word)){
            System.out.println(true);
        }

    }

}

package day14_StringClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWork_CharacterOfTheWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(word.substring(0,1));
        System.out.println(word.substring(word.length()-1));


    }




}

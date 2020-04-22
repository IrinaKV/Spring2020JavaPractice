package day15_ForLoop;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next();

        String revers1 = "";

        for(int i = word.length()-1; i >0; i--){
            revers1+= word.charAt(i);

        }System.out.println(revers1);

    }
}

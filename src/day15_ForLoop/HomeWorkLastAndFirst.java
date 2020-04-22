package day15_ForLoop;

import java.util.Scanner;

public class HomeWorkLastAndFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word.substring(0,1)+word.substring(word.length()-1));
    }

}

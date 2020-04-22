package day15_ForLoop;

import java.util.Scanner;

public class LongerWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE

        if(word1.length()>= word2.length()){
            System.out.println(word1);
        }
        System.out.println(word2);

    }
}

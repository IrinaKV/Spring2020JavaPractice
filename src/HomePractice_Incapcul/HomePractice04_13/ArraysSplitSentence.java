package HomePractice_Incapcul.HomePractice04_13;

import java.util.Scanner;

public class ArraysSplitSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] arr = sentence.split(" ");
        for(String eachWord:arr){
            System.out.println(eachWord);
        }

    }
}

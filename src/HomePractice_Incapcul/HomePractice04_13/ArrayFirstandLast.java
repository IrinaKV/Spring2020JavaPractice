package HomePractice_Incapcul.HomePractice04_13;

import java.util.Scanner;

public class ArrayFirstandLast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


        //TODO: Write your code below
        for(String eachWord : words){
            System.out.println(eachWord.substring(0,1)+ eachWord.substring(eachWord.length()-1));
        }




    }
}

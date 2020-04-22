package day17_while_loops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter yes or no");
        String  word = scan.next();

        boolean valid = word.equalsIgnoreCase("yes") ||word.equalsIgnoreCase("no");

        while(!valid){
            System.out.println("Please re-entered");
            word = scan.next();


            if(word.equalsIgnoreCase("yes") ||word.equalsIgnoreCase("no")){
                break;
            }
        }
        if(word.equalsIgnoreCase("yes")){
            System.out.println("You entered yes");
        }
        if(word.equalsIgnoreCase("no")){
            System.out.println("you enterd no");
        }


    }
}

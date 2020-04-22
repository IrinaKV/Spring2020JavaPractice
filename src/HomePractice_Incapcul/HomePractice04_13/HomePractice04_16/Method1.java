package HomePractice_Incapcul.HomePractice04_13.HomePractice04_16;

import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {
        plus();
    }


    public static void plus(){
        //System.out.println("enter first number: ");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        //System.out.println("enter second number: ");
        int num2 = scan.nextInt();
        System.out.println("result: " + (num1 +num2));

    }
}

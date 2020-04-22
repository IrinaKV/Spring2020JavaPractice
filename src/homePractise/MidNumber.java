package homePractise;

import java.util.Scanner;

public class MidNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = input.nextInt();
        System.out.println("Enter second number:");
        int num2 = input.nextInt();
        System.out.println("Enter third number:");
        int num3 = input.nextInt();

        //WRITE YOUR CODE HERE
        String st = "Medium value is: ";
        int mid = 0;
        if((num1>num2 && num1<num3) ||(num1>num3 && num1<num2)){
         mid = num1;
        }else if ((num2>num1 && num2<num3) ||(num2>num3 && num2<num1)){
            mid = num2;
        }else if ((num3>num1 && num3<num2) ||(num3>num2 && num3<num1)){
            mid = num3;
        } else {System.out.println("Input different numbers");

        }
        System.out.println(st + mid);
    }
}

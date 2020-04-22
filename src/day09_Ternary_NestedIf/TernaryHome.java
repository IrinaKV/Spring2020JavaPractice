package day09_Ternary_NestedIf;

import java.util.Scanner;

public class TernaryHome {
    public static void main(String[] args) {
        //052
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int x = scan.nextInt();
        //WRITE YOUT CODE HERE
        int b =	(x>=5) ? x: -x;
        System.out.println(b);
        System.out.println("------------------------------------------------------------------");
        // 053

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1 = scan1.nextInt();
        System.out.println("Enter number2:");
        int num2 = scan1.nextInt();
        //WRITE YOUR CODE HERE
        int max = num2 > num1 ? num2 : num1;
        System.out.println(max);
    }
}

package day10_Switch_Scanner;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        num = scan.nextInt();
        digit1 = num/10000;
        digit2 = (num - digit1*10000)/1000;
        digit3 = (num - digit1*10000 - digit2 *1000)/100;
        digit4 = (num - digit1*10000 - digit2 *1000 - digit3*100)/10;
        digit5 = (num - digit1*10000 - digit2 *1000 - digit3*100-digit4*10);

        System.out.println(digit1);
        System.out.println(digit2);
        System.out.println(digit3);
        System.out.println(digit4);
        System.out.println(digit5);



    }









    /*

    In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

     */
}



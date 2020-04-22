package day10_Switch_Scanner;
import java.util.Scanner;

public class ScanerClass {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Inter your fist number");
        byte num1 = num.nextByte();
        System.out.println("Inter your second number");
        byte num2 = num.nextByte();
        System.out.println("The sum of " + num1+  " and "+ num2+ " are: " + (num1 +num2));

    }


}

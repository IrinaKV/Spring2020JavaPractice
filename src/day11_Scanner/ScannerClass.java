package day11_Scanner;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a long number: ");
        //long a = 999999999999l;
        long a = scan.nextLong();
        System.out.println("You have entered " + a);
    }
}

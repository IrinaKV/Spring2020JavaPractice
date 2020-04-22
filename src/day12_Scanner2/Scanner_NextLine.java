package day12_Scanner2;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt();
        System.out.println(num);

        scan.nextLine();//use for take Enter

        System.out.println("Enter your name");
        String name = scan.nextLine();
        System.out.println(name);
    }


}

package day13_StringClass;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        String fistName = fullName.substring(0, 1).toUpperCase();
        String lastName = fullName.substring(fullName.indexOf(" "), fullName.indexOf(" ")+2).toUpperCase();
        System.out.println(fistName.concat(lastName));






    }

}

package day12_Scanner2;

import java.util.Scanner;

public class Scanner_NextLine2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 79 JonesBranch Dr, McLean VA, 22034

        System.out.println("Building Number");
        int bNumber = scan.nextInt();

        scan.nextLine();// Enter

        System.out.println("Street is: ");
        String street = scan.nextLine();
        // scan.nextLine();

        System.out.println("City is: ");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();


        System.out.println("Enter the Zip Code");
        int zipCode = scan.nextInt();
        scan.nextLine();// Enter

        System.out.println(bNumber + " " + street +  " " + city + ", " + state+ " " +  zipCode);
        scan.close();
    }
}

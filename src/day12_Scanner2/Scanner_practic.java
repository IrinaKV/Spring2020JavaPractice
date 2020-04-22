package day12_Scanner2;

import java.util.Scanner;

public class Scanner_practic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String address = "";
        System.out.println("Enter your number of home");
        int numberHome = scan.nextInt();
        address+= numberHome + " ";

        System.out.println("Enter your name of street");
        String nameOfStreet = scan.next();
        address += nameOfStreet + ", ";

        System.out.println("Enter your city");
        String  nameOfCity = scan.next();
        address+= nameOfCity + " ";

        System.out.println(" My address is: " + address);


    }


}

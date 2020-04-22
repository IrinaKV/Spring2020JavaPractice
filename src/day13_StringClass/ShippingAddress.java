package day13_StringClass;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        /*
        write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");

        String buildingNum = scan.next();
        scan.nextLine();
        System.out.println("Enter street address");
        String  streetAddress = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter state code");
        String stateCode = scan.next();

        scan.nextLine();
        System.out.println("Enter your zip code");
        String zipCode = scan.next();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        String result = "Ship to: "+ fullName + "\n\t\t" + buildingNum + " " + streetAddress+
                "\n\t\t"  + cityName+  " "+ stateCode+ " " + zipCode;

        System.out.println(result);
    }
}

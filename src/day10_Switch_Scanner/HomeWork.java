package day10_Switch_Scanner;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Enter your areaCode");
        int areaCode = scan.nextInt();
        //System.out.println("Enter your localNumber");
        int localNumber= scan.nextInt();
        String phoneNumber = "(" + areaCode + ")-" +
                "" + localNumber;
        System.out.println("Calling number " + phoneNumber);
    }
}

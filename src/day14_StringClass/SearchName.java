package day14_StringClass;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SearchName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String user = scan.nextLine();

        if(user.toLowerCase().equals("max payne")||user.toLowerCase().equals("alan wake")){
            System.out.println("User found!");
        }else {System.out.println("User not found!");


            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

            DecimalFormat format = new DecimalFormat("0.00");
            double a = 34.567890;
            System.out.println(format.format(a));
            System.out.println(format.format(a)+1);
            System.out.println(format.format(a)+3);
            double d = Double.parseDouble(format.format(a));
            a = Double.parseDouble(format.format(a));
            System.out.println(d);
            System.out.println(a);
    }
}
}

package day15_ForLoop;

import java.util.Scanner;

public class HomeWorkTest {
    public static void main(String[] args) {
        boolean smoking;
        int propertyPrice = 430000;
        Scanner scan = new Scanner(System.in);
        System.out.println("Does any of your family members smoking?");
        smoking = scan.nextBoolean();
        System.out.println(smoking);
        if(smoking==true){

          propertyPrice-= 5000;
        }


        System.out.println("Market report has been generated.");
        System.out.println("Your estimate market price is: "+ propertyPrice +"$");

    }
}

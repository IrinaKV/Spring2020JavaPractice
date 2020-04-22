package day10_Switch_Scanner;

import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        int couponsForCandyBar = 10;
        int couponsForGumball = 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int numOFCupons = scan.nextInt();

        int numberOfCandies = numOFCupons/couponsForCandyBar;
        int numberOfGumballs = numOFCupons%couponsForCandyBar/couponsForGumball;
        if (numberOfCandies > 0 && numberOfGumballs >0){
            System.out.println("Number of Candies: " + numberOfCandies);
            System.out.println("Number of Gumballs: " + numberOfGumballs);
        }else
            System.out.println("Not enough coupons");




    }
}

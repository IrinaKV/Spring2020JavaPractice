package day10_Switch_Scanner;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int quarters = 25, dimes =10, nickels = 5;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price in cents: ");
        int itemPrice = scan.nextInt();
        String st = "";

        if(itemPrice >= 25 && itemPrice < 100 && itemPrice % 5==0){
          if(itemPrice == 95){
            quarters = 0;
            dimes = 0;
            nickels = 1;
          }else if(itemPrice == 90){
            quarters = 0;
            dimes = 1;
            nickels = 0;
          }else if(itemPrice == 85){
            quarters = 0;
            dimes = 1;
            nickels = 1;
          }else if(itemPrice == 80){
              quarters = 0;
              dimes = 2;
              nickels = 0;
          }else if(itemPrice == 75){
              quarters = 1;
              dimes = 0;
              nickels = 0;
          }else if(itemPrice == 70){
              quarters = 1;
              dimes = 0;
              nickels = 1;
          }else if(itemPrice == 65){
              quarters = 1;
              dimes = 1;
              nickels = 0;
          }else if(itemPrice == 60){
              quarters = 1;
              dimes = 1;
              nickels = 1;
          }else if(itemPrice == 55){
              quarters = 1;
              dimes = 2;
              nickels = 0;
          }else if(itemPrice == 50){
              quarters = 2;
              dimes = 0;
              nickels = 0;
          }else if(itemPrice == 45){
              quarters = 2;
              dimes = 0;
              nickels = 1;
          }else if(itemPrice == 40){
              quarters = 2;
              dimes = 1;
              nickels = 0;
          }else if(itemPrice == 35){
              quarters = 2;
              dimes = 1;
              nickels = 1;
          }else if(itemPrice == 30){
              quarters = 2;
              dimes = 2;
              nickels = 0;
          }else if(itemPrice == 25){
              quarters = 3;
              dimes = 0;
              nickels = 0;
          }
            System.out.println("Your change is " + quarters + "quarters, " + dimes+ " dimes, and " +
                   nickels + " nickels." );




        }else
            System.out.println("Invalid price!");



    }
}

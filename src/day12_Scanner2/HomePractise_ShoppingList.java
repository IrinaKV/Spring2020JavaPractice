package day12_Scanner2;

import java.util.Scanner;

public class HomePractise_ShoppingList {
    public static void main(String[] args) {
        int count1=0, count2=0, count3=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.nextLine();
        count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        scan.nextLine();
        String item2 = scan.nextLine();
        count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        scan.nextLine();
        String item3 = scan.nextLine();
        count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double totalPrice = 0;
        String st1="", st2= "", st3="";
        if(count1>0){
          st1 = "Item1: " + item1 +" Price: " + price1*count1;
          totalPrice+= price1*count1;

        }
        if(count2>0){
          st2 = ", Item2: " + item2 +" Price: " + price2*count2;
            totalPrice+= price2*count2;

        }
        if(count3>0){
         st3 = ", Item3: " + item3 +" Price: " + price3*count3;
            totalPrice+= price3*count3;

        }
        System.out.println(st1 + st2 +st3);
        System.out.println( "Total price: " +totalPrice);


    }
}

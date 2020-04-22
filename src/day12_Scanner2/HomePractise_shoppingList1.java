package day12_Scanner2;

import java.util.Scanner;

public class HomePractise_shoppingList1 {
    public static void main(String[] args) {
        String item1="", item2= "", item3 = "", report ="";
        Double price1=0.0,price2=0.0, price3=0.0,totalPrice=0.0;

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Item1 and its price:");
        item1 = scan.nextLine();
        price1 = scan.nextDouble();

        System.out.println("Enter Item2 and its price:");
        scan.nextLine();
        item2 = scan.nextLine();
        price2 = scan.nextDouble();

        System.out.println("Enter Item3 and its price:");
        scan.nextLine();
        item3 = scan.nextLine();
        price3 = scan.nextDouble();

        totalPrice = price1 +price2 +price3;
        report = "Item1: "+ item1 + " Price: "+ price1+" Item2: "+item2+" Price: "+ price2+
                " Item3: "+item3+ "Price: "+ price3;

        System.out.println(report);
        System.out.println("Total price: "+ totalPrice);


    }
}

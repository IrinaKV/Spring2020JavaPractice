package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class ShopingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        System.out.println("Enter Item"+ count +" and its price:");
        item = scan.nextLine();
        price= scan.nextDouble();


        shoppingListReport= "Item"+ count + ": " +item+" Price: "+price +", ";
        totalPrice+= price;
        System.out.println("Add one more item?");
        String answer = scan.next();
        while (answer.equalsIgnoreCase("yes")){
        count++;
        System.out.println("Enter Item"+ count +" and its price:");
            item = scan.next();

            price= scan.nextDouble();
            totalPrice+=price;
            shoppingListReport+= "Item"+ count + ": " +item+" Price: "+price +", ";
            System.out.println("Add one more item?");
            answer = scan.next();
        }
        shoppingListReport = shoppingListReport.substring(0, shoppingListReport.length()-2);
        System.out.println(shoppingListReport);
        System.out.println("Total price: "+totalPrice);

    }
}

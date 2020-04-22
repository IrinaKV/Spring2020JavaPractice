package day14_StringClass;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to buy");
        float giftCard = 100f;
        String item = scan.nextLine();

        if(item.equals("Charger")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-15));
        } else if(item.equals("USB cable")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-10));

        }else if(item.equals("Headphones")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-30));

        }else if(item.equals("Pants")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-50));

        }else if(item.equals("Hat")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-25));
        }else if(item.equals("Socks")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-5));
        }else if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-60));
        }else if(item.equals("Pillow")){
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard-40));
        }else if(item.equals("Smartphone")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(item.equals("Laptop")){
        System.out.println("Sorry, not enough funds on your gift card!");

        }else{
            System.out.println(" Invalid item!");
        }

    }
}


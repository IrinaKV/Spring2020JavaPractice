package homePractise;

import java.util.Scanner;

public class LeasingOffice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;
        //WRITE YOUR CODE HERE
        String st = "";
        if(numberOfBedrooms ==1){
        st ="One Bedroom Selected";
        startingPrice = 1100;
        } else if(numberOfBedrooms ==2){
         st= "Two Bedroom Selected";
         startingPrice = 1850;
        } else if(numberOfBedrooms ==3){
        st = "Three Bedroom Selected";
        startingPrice = 2550;
        }else st = "No such Bedrooms available";
        System.out.println(st);
        System.out.println("Starting Price: " + startingPrice);

    }
}

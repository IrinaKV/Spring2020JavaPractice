package day14_StringClass;

import java.util.Scanner;

public class TipsCalculator2 {
    public static void main(String[] args) {
        double totalToPay = 0;
        double totalTip = 0;
        double totalPerPerson = 0;
        double tipPerPerson = 0;
        String numOfPeople = "";

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();

        System.out.println("Number of people:");
        int numberOfPeople = scan.nextInt();

        System.out.println("Check amount:");
        double checkAmount = scan.nextFloat();

        scan.nextLine();
        System.out.println("Service Quality:");
        String serviceQuality = scan.nextLine();


        if(serviceQuality.equals("Poor")&& split.equals("Yes")){
            for (int i= 1; i<=numberOfPeople; i ++){
                numOfPeople+= "&";
                totalTip = checkAmount * 0.5;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay/i;
                tipPerPerson = totalTip/i;
            }

        }else if(serviceQuality.equals("Fair")&& split.equals("Yes")) {
                for (int i = 1; i <= numberOfPeople; i++) {
                numOfPeople += "&";
                totalTip = checkAmount * 0.10;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay / i;
                tipPerPerson = totalTip / i;
                }
        }else if(serviceQuality.equals("Good")&& split.equals("Yes")){
            for(int i=1; i<= numberOfPeople; i++){
                numOfPeople+= "&";
                totalTip = checkAmount * 0.15;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay/i;
                tipPerPerson = totalTip/i;

            }
        }else if (serviceQuality.equals("Great")&& split.equals("Yes")){
                for(int i=1; i<= numberOfPeople; i++){
                numOfPeople+= "&";
                totalTip = checkAmount * 0.20;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay/i;
                tipPerPerson = totalTip/i;

                }
        }else if (serviceQuality.equals("Excellent")&& split.equals("Yes")){
                for(int i=1; i<= numberOfPeople; i++){
                numOfPeople+= "&";
                totalTip = checkAmount * 0.25;
                totalToPay = checkAmount + totalTip;
                totalPerPerson = totalToPay/i;
                tipPerPerson = totalTip/i;

                }
        }
        System.out.println("Number of people entered: " + numOfPeople);
        System.out.println("Total to pay: " + totalToPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totalPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);



        }

    }

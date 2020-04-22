package HomeWork04_05_2020;

import java.util.Scanner;

public class Has_a_Java {
    public static void main(String[] args) {

        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String haveDriverLicense = scan.nextLine();
        if (haveDriverLicense.equalsIgnoreCase("Yes")) {

            System.out.println("Enter your zip code");
            int zipCode = scan.nextInt();
            if (zipCode == 20910 || zipCode == 20740) {
                premium = 60;
            }
            else if (zipCode == 22102 || zipCode == 22103) {
                premium = 30;
            }
            else {
                premium = 50;
            }


            System.out.println("Is this vehicle Owned, Financed, or Leased?");
            scan.nextLine();
            vehicleOwnership = scan.nextLine();
            if (vehicleOwnership.equalsIgnoreCase("owned")) {
                premium += 10;
            }
            else {
                premium += 20;
            }

            System.out.println("How is this vehicle primarily used?");
            vehicleUsage = scan.nextLine();
            if (vehicleUsage.equalsIgnoreCase("Business")) {
                premium += 50;
            }
            else if (vehicleUsage.equalsIgnoreCase("Pleasure")) {
                premium += 10;
            }
            else {
                premium += 20;
                System.out.println("Days Driven To Work And/Or School");
                daysDrivenToWorkOrSchool = scan.nextInt();
                premium += daysDrivenToWorkOrSchool*5;

                System.out.println("Miles Driven To Work And/Or School");
                milesToWorkOrSchool = scan.nextInt();
                premium += milesToWorkOrSchool;
            }

            System.out.println("How old are you?");
            int age = scan.nextInt();
            if (age < 16) {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            else if ((age == 16) && (age == 17)) {
                premium *= 20;
            }
            else if ((age >= 18) && (age <=21)) {
                premium *= 6;
            }
            else if ((age > 21) && (age < 25)) {
                premium *= 2;
            }

            System.out.println("How many years you've been driving?");
            int yearsOfDriving = scan.nextInt();
            if ((yearsOfDriving <= 0) || ((age - yearsOfDriving) < 16)) {
                System.out.println("Invalid data!");
                System.exit(0);
            }
            premium -= yearsOfDriving*5;

            System.out.println("Have you had any accidents in the last 5 years?");
            scan.nextLine();
            String accidents = scan.nextLine();
            if (accidents.equalsIgnoreCase("yes")) {
                System.out.println("How many?");
                accidentsAmount = scan.nextInt();
                premium += accidentsAmount * (premium/100*20);
            }

            System.out.println("Have you had continuous insurance for the past 12 months?");
            continuousInsurance = scan.nextLine();
            if (continuousInsurance.equalsIgnoreCase("no")) {
                premium *= premium;
            }

            System.out.println("What is the highest level of education you have completed?");
            education = scan.nextLine();
            if (education.equals("PhD") || education.equals("Bachelors") || education.equals("Masters")) {
                premium -= premium/100*5;
            }
            else if (education.equals("Doctors")) {
                premium -= premium/100*10;
            }
            else  if (education.equals("Less than High School")) {
                premium += premium/100*5;
            }

            System.out.println(name + ", here's your quote!");
            System.out.println("Start Your Policy Today For: $" + premium);
            System.out.println("Reference number: " + name.substring(0,2).toUpperCase() + age +
                    name.substring(name.length() - 2).toUpperCase() +
                    zipCode + education.toUpperCase());
        }
        else {
            System.out.println("Invalid data!");
            System.exit(0);
        }


    }

}

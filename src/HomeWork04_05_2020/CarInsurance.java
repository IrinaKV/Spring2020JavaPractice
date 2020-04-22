package HomeWork04_05_2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {

        /*
        79.8
        Ray
        Yes
        20910
        Owned
        Business
        45
        10
        Yes
        1
        Yes
        Bachelors
        Teacher expe/

        Tom
    Yes
    24032
    Leased
    Commute
    5
    10
    50
    20
    Yes
    3
    No
    Masters
    $76.0
         */
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
        name = scan.next();
        System.out.println("Do you have a US driver license?");
                         scan.nextLine();
        String license = scan.next();
        if(license.equalsIgnoreCase("no")){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        System.out.println("Enter your zip code");
        String zipCode = scan.next();
        if(zipCode.equals("20910") || zipCode.equals("20740")){
            premium+= 60;
        }else if(zipCode.equals("22102") || zipCode.equals("22103")){
            premium+= 30;
        }else {
            premium+=50;
        }
        System.out.println(premium);
        System.out.println("Is this vehicle Owned, Financed, or Leased?");
        vehicleOwnership = scan.next();
        if(vehicleOwnership.equalsIgnoreCase("Owned")){
            premium+= 10;
        }else {
            premium+= 20;
        }

        System.out.println(premium);
        System.out.println("How is this vehicle primarily used?");
        vehicleUsage = scan.next();

        if(vehicleUsage.equalsIgnoreCase("Pleasure")){
            premium+=10;

        }else if(vehicleUsage.equalsIgnoreCase("Business")){
            premium+=50;

        }else if(vehicleUsage.equalsIgnoreCase("commute")) {
           premium+=20;
            System.out.println(premium);
            System.out.println("Days Driven To Work And/Or School");
            daysDrivenToWorkOrSchool= scan.nextInt();
            for (int i = 1; i <= daysDrivenToWorkOrSchool; i++) {
                premium += 5;

            }
            System.out.println(premium);
            System.out.println("Miles Driven To Work And/Or School");
            milesToWorkOrSchool = scan.nextInt();
            premium+=milesToWorkOrSchool*1;
            System.out.println(premium);
        }
        System.out.println(premium);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        if(age<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }
        if(age>=16 && age<18){
            premium*=20;
        }if(age>=18 && age<=21){
            premium*=6;
        }if(age>21 && age<25){
            premium*=2;
        }
        System.out.println(premium);
        System.out.println("How many years you've been driving?");
        int ageDriving = scan.nextInt();
        if(ageDriving<=0||(age - ageDriving)<16){
            System.out.println("Invalid data!");
            System.exit(0);
        }else{
            premium = premium-ageDriving*5;
        }
        System.out.println(premium);
        System.out.println("Have you had any accidents in the last 5 years?");
        String accident = scan.next();
        if(accident.equalsIgnoreCase("Yes")){
            System.out.println("How many?");
            accidentsAmount = scan.nextInt();

                premium = premium*0.2*accidentsAmount;



        }
        System.out.println(premium);
        System.out.println("Have you had continuous insurance for the past 12 months?");
        continuousInsurance= scan.next();
        if(continuousInsurance.equalsIgnoreCase("no")){
            premium*=2;
        }
        System.out.println(premium);
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");

        education= scan.nextLine();
        if(education.equalsIgnoreCase("PhD") ||
           education.equalsIgnoreCase("Bachelors")||
           education.equalsIgnoreCase("Masters")){
            premium -= 0.05* premium;


        }
        if(education.equalsIgnoreCase("Doctors")){
            premium-= 0.1*premium;

        }
        if(education.equalsIgnoreCase("Less than High School")){
            premium+= 0.05*premium;


        }
        System.out.println(premium);
        if(education.contains(" ")){
        education= education.replace(" ", "");

        }
        System.out.println(name + ", here's your quote!");
        System.out.println("Start Your Policy Today For: $" +premium);
        referenceNumber = name.substring(0,2).toUpperCase()+age+
                name.substring(name.length()-2).toUpperCase()+
                zipCode + education.toUpperCase();
        System.out.println("Reference number: "+referenceNumber);

    }
}

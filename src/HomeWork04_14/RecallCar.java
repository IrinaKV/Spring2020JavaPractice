package HomeWork04_14;

import java.util.Scanner;

public class RecallCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = scan.next();
        int year = scan.nextInt();
        boolean recalled = false;


        if((year == 2012 ||year==2011 ||year==2010 )&& (model.equalsIgnoreCase("Extravagant"))){
            recalled=true;
            System.out.println(recalled);
        }else if ((year == 2015 || year == 2016 || year == 2017 || year == 2018)&& (model.equalsIgnoreCase("Guzzler"))){
            recalled = true;
            System.out.println(recalled);
        }else{
            System.out.println(false);
        }


    }
}

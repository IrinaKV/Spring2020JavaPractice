package day20_ArrayContinue;

import java.util.Scanner;

public class Array_12Months {
    public static void main(String[] args) {
        String[] months ={"Jan", "Feb", "Mar", "Apr", "May", "Jul", "Jul", "Aug", "Sep", "Oct", "Nov","Dec"};

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        String result = "";
        int number = scan.nextInt();
        while (number>12 || number<=0){
            System.out.println("Invalid Entry");
            System.out.println("Please, re-enter number");
            number = scan.nextInt();


        }
         result =   months[number-1];
        System.out.println(result);




    }
}

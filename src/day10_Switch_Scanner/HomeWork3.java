package day10_Switch_Scanner;

import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of milligrams in drink:");
        int yourDrink = scan.nextInt();
        //10 000 mg - overdose
        int outputs = 10000/yourDrink;


        System.out.println("It would take about " + outputs + " drinks for a lethal overdose.");


    }



}

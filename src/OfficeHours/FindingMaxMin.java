package OfficeHours;

import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FindingMaxMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max =MIN_VALUE;
        int min = MAX_VALUE;
        int i =1;
        while (i<=3){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min = num;
            }
            i++;
        }
        System.out.println("maximum number is: " +max);

        System.out.println("minimum number is: " +min);
    }

}

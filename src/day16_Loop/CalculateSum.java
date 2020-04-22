package day16_Loop;

import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");//100

        int num = scan.nextInt();
        int sum =0;

        for (int i = 1; i <=num ; i++) {
          sum+= i;
        }

        System.out.println(sum);
    }
}

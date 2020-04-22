package day17_while_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxNumber = -1999999999;
        int minNumber = 1999999999;
        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>maxNumber){
                maxNumber = num;
            }else if(num<minNumber){
                minNumber=num;
            }

        }
        System.out.println(maxNumber + " is max number");
        System.out.println(minNumber+ " is min number");



    }
}

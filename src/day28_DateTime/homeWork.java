package day28_DateTime;

import java.util.Scanner;

public class homeWork {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("#1: ");
        int num1 = s.nextInt();
        System.out.print("#2: ");
        int num2 = s.nextInt();
        //start on line 11
        if(num2>num1){
            for (int i =num1 ; i <= num2; i++) {
                if(i%2!=0){
                    System.out.print(i +" ");
                }
            }

        }


    }

}

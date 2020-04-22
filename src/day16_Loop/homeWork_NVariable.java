package day16_Loop;

import java.util.Scanner;

public class homeWork_NVariable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        int multi = 1;
        for (int i = n; i >0; i--) {

            sum+=i;

        }
        System.out.println(sum);
        System.out.println("============================================");

        for (int i = n; i >0; i--) {

            multi*= i;

        }
        System.out.println(multi);


    }
}

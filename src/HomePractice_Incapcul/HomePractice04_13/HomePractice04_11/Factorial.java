package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long factorial=1;
        while (n>0){
            factorial=factorial*n;
            n--;
        }
        System.out.println(factorial);

    }
}

package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        String result ="";
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while (i<=n){
            while (j<=i) {
                result+= "*";
                System.out.println(result);
                j++;
            }
            i++;

        }
        System.out.println();
    }
}

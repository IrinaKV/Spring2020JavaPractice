package HomeWork04_14;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Arrays_convert_binari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for (int i = 0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }
        String number = "";
        for(int eachNumber : binary){
           number+= eachNumber; }

        int decValue = 0, base =1, tempr =Integer.parseInt(number) ;
        while (tempr>0){
            int last = tempr%10;
            tempr=tempr/10;
            decValue += last*base;
            base = base*2;
        }
        System.out.println(decValue);



    }
}

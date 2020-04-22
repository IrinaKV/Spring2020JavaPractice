package HomeWork04_14;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayZombi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int[] inhabitants2 = new int[8];

        int count = 0;
        System.out.print("Day "+ count +" ");

        System.out.println(Arrays.toString(inhabitants));

        do {
            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i]=inhabitants[i]/2;
            }
            count++;
            System.out.print("Day "+ count +" ");

            System.out.println(Arrays.toString(inhabitants));


        }while (!Arrays.equals(inhabitants,inhabitants2));
        System.out.println("---- EXTINCT ----");

    }
}

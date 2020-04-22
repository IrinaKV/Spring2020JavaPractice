package HomePractice_Incapcul.HomePractice04_13.HomePractice04_16;

import java.util.Scanner;

public class print10 {
    /*
    Create a method called next3 . This method gets an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
     */

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();

        next3(num);

    }

    public  static void next3(int a){
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
          arr[i] = a+1;
            a++;
            System.out.print(arr[i] +" ");

        }

    }
}
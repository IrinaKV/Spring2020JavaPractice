package HomePractice_Incapcul.HomePractice04_13;

import java.util.Scanner;

public class Arrays_Revers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        String[] arr = sentence.split(" ");
        for (int i = arr.length-1; i >=0; i--) {
            System.out.println(arr[i]);

        }


    }

}

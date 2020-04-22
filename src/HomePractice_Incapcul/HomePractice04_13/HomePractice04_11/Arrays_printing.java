package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Arrays_printing {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int j = 0; j <= arr.length-1; j++) {
            System.out.println(arr[j].substring(0,3));

        }




    }


}

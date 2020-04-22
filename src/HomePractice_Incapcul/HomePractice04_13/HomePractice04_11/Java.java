package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Java {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        int count = 0;
        while (word.toLowerCase().contains("java")){
            count++;
            word= word.replaceFirst("java", "");
        }

        System.out.println(count);


    }

}

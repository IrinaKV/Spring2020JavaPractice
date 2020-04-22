package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Arrays_printing2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
        for (int i = 0; i <= words.length-1 ; i++) {
            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));
        }
    }

}

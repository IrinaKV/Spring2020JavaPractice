package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class FindMaxLengthInStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }
        String maxWord= "";
        for (int i = 0; i < words.length ; i++) {
            if(words[i].length()>maxWord.length()){
                maxWord= words[i];
            }

        }
        System.out.println(maxWord);
    }
}

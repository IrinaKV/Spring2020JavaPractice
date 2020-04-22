package day14_StringClass;

import java.util.Scanner;

public class MiddleCaracter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word");
        String word1 = scan.next();

        String middleCharacter = "";

        int totalChars= word1.length();
        int middleNumber = totalChars/2;

        if(totalChars%2!=0){
            middleCharacter+= word1.charAt(middleNumber);
        }else{
            middleCharacter+= word1.charAt(middleNumber-1)+ "" +word1.charAt(middleNumber);
        }

        System.out.println(middleCharacter);



    }
}

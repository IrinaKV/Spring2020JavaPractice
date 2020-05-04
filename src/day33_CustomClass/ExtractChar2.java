package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChar2 {
    public static void main(String[] args) {
        String str = str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> letters= new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> specialChar= new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

                if(Character.isLetter(each)){
                    letters.add(each);
                }else if(Character.isDigit(each)){
                    digit.add(each);
                }else{
                    specialChar.add(each);
                }

        }
        System.out.println(letters);
        System.out.println(digit);
        System.out.println(specialChar);


    }
}

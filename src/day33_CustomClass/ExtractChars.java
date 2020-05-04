package day33_CustomClass;

import java.util.ArrayList;

public class ExtractChars {
    public static void main(String[] args) {
       //str = "ABCD123$%#@&456EFG!";

       String str = str = "ABCD123$%#@&456EFG!";
       char[] arr = str.toCharArray();
        ArrayList<Character> letters= new ArrayList<>();
        ArrayList<Character> digit = new ArrayList<>();
        ArrayList<Character> specialChar= new ArrayList<>();

        for(char each:arr){
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

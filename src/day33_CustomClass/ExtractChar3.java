package day33_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class ExtractChar3 {
    public static void main(String[] args) {
        String str = str = "ABCD123$%#@&456EFG!";
        char [] arr = str.toCharArray();
        Character[] ch = new Character[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ch[i] = arr[i];
        }
        System.out.println(Arrays.toString(ch));

        ArrayList<Character> letters= new ArrayList<>(Arrays.asList(ch));
        letters.removeIf(p-> !Character.isLetter(p));
        System.out.println(letters);

        ArrayList<Character> digit = new ArrayList<>(Arrays.asList(ch));
        digit.removeIf(p-> !Character.isDigit(p));
        System.out.println(digit);

        ArrayList<Character> specialChar= new ArrayList<>(Arrays.asList(ch));
        //specialChar.removeAll(letters);
        //specialChar.removeAll(digit);
        specialChar.removeIf(p-> Character.isDigit(p) || Character.isLetter(p));
        System.out.println(specialChar);



    }
}

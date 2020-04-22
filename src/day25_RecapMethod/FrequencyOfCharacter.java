package day25_RecapMethod;

import Resources.Library.Library;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str = "AABBCC";
        System.out.println(FrequencyOfCharacter("AASSAADDEEERAAAAAA"));

        String nonDublicat = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < nonDublicat.length(); i++) {
            String ch = "" + nonDublicat.charAt(i);
            int num = Library.Friquency(str, ch);
            result += ch + num;
        }
        System.out.println(result);
    }

    public static String FrequencyOfCharacter(String str) {

        String nonDublicat = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < nonDublicat.length(); i++) {
            String ch = "" + nonDublicat.charAt(i);
            int num = Library.Friquency(str, ch);
            result += ch + num;
        }
       return result;
    }
}


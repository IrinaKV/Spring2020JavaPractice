package HomeWork04_28;

import java.util.ArrayList;

public class Methods182 {
    public static void test(ArrayList<String> words)
    {
        words.set(0,"git");
        words.set(2,"gud");
        System.out.println(words);

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("A");
        words.add("b");
        words.add("c");
        words.add("S");
        words.add("F");
        words.add("X");
        test(words);
    }


}

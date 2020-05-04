package day30_ArrayList.HomeWork;

import java.util.ArrayList;

public class Methods187 {
    public static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){
        ArrayList<String> wordList =new ArrayList<>();
        for (int i = 0; i < wordList1.size() ; i++) {
                wordList.add(wordList1.get(i));


        }
        for (int i = 0; i < wordList2.size(); i++) {
            wordList.add(wordList2.get(i));

        }
        return wordList;

    }

    public static void main(String[] args) {
        ArrayList<String> wordList1 = new ArrayList<>();
        ArrayList<String> wordList2 = new ArrayList<>();

        wordList1.add("Ja");
        wordList1.add("Jat");
        wordList1.add("tJau");
        wordList1.add("Jay");
        wordList1.add("Jaqw");
        wordList2.add("Jyhbfa");
        wordList2.add("Jat");
        wordList2.add("Jag");
        wordList2.add("gJa");
        wordList2.add("geJa");
        System.out.println(combineAL(wordList1, wordList2));





    }
}

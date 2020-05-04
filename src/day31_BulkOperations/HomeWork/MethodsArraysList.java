package day31_BulkOperations.HomeWork;
import java.util.ArrayList;
import java.util.Arrays;

public class MethodsArraysList {
public static void removeAll(ArrayList<String> wordList, String targetWord){
    do {
       wordList.remove(targetWord);
    }while (wordList.contains(targetWord));
}

    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<String>(Arrays.asList("hi","hey","hi","yo"));

        removeAll(wordList,"hi");

        System.out.println(wordList);
    }

}

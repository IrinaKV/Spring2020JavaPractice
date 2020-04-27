package day29_WrepperClass;
import java.util.ArrayList;
public class ListIntro {
    public static void main(String[] args) {
        ArrayList<String> listName = new ArrayList<>();
        ArrayList<Integer> listNumbers = new ArrayList<>();

        listNumbers.add(10);
        listNumbers.add(30);
        listNumbers.add(70);
        System.out.println(listNumbers);
        System.out.println(listNumbers.size());

        System.out.println(listNumbers.get(1));
        Integer a1 = listNumbers.get(2);
        int a2 = listNumbers.get(2);
        double a3 = listNumbers.get(2);
        System.out.println(a3);
        System.out.println(a2);
        System.out.println(a1);
    }

}

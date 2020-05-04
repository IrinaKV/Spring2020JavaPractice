package day30_ArrayList.HomeWork;

import java.util.ArrayList;

public class methods199 {
    public static void main(String[] args) {
        ArrayList<Boolean> list = new ArrayList<>();
        list.add(true);
        list.add(false);
        list.add(false);
        repeatAL(list);

    }

    public static void repeatAL(ArrayList<Boolean> list ){
        int a =list.size();
        for (int i = 0; i < a ; i++) {
           list.add(list.get(i));
        }
    }
}

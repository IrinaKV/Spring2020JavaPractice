package day29_WrapperClass;

import java.util.ArrayList;

public class List_Practice {

    public static void main(String[] args) {
        ArrayList<String> shopingList = new ArrayList<>();
        shopingList.add("Eggs");
        shopingList.add("Onion");
        shopingList.add("Potato");
        shopingList.add("Cookis");
        shopingList.add("Milk");
        for (String each:shopingList){
            System.out.println(each);
        }
        int size = shopingList.size();
        System.out.println(size);
        int lastIndex = shopingList.size()-1;
    }
}

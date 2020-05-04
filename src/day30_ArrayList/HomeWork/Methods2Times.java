package day30_ArrayList.HomeWork;

import java.util.ArrayList;

public class Methods2Times {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> twoTimes(ArrayList<Integer> list1){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            list.add(list1.get(i));
            list.add(list1.get(i));
        }
        return list;

    }

}

package day30_ArrayList.HomeWork;
import java.util.ArrayList;
public class Methods190 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-6);
        list.add(3);
        list.add(-8);
        list.add(0);
        list.add(4);
        list.add(3);
        System.out.println(appendPosSum(list));


    }
    public static ArrayList <Integer> appendPosSum(ArrayList <Integer> list){
        ArrayList<Integer> listSumPositiv = new ArrayList<>();
        int sum= 0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>0){
                listSumPositiv.add(list.get(i));
                sum+=list.get(i);
            }
        }

        listSumPositiv.add(sum);
        return listSumPositiv;
    }



}

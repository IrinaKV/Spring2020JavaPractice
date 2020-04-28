package day29_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<>();
        listNum.add(11);
        listNum.add(18);
        listNum.add(31);
        listNum.add(19);
        listNum.add(81);
        listNum.add(88);
        int max = Integer.MIN_VALUE;
        /*for (Integer each :listNum){
            if(each>max){
                max = each;
            }
            System.out.print(max +" ");
        }*/
        System.out.println("+++++++++++++++++++++++++++++++");
        for (int i = 0; i <listNum.size() ; i++) {
            if(listNum.get(i)>max){
                max = listNum.get(i);
            }


        }
        System.out.print(max +" ");

        System.out.println();
        System.out.println("+++++++++++++++++++++++++++");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(699);
        list2.add(299);
        list2.add(99);
        list2.add(2999);
        System.out.println(max(list2));

    }

    public static int max(ArrayList<Integer> list ){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)>max){
                max = list.get(i);
            }


        }
       return max;

    }
    public static int min(ArrayList<Integer> list ){
        int min = Integer.MIN_VALUE;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<min){
                min = list.get(i);
            }


        }
        return min;

    }

}

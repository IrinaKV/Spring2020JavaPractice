package day30_ArrayList.HomeWork;

import java.util.ArrayList;

public class MethodsSwap {
    public static ArrayList<String> swap(ArrayList<String> list, int pos1, int pos2)
    {
       String str1= list.get(pos1);
       String str2 =list.get(pos2);
       list.set(pos2,str1);
       list.set(pos1,str2);
       return list;
    }

    public static void main(String[] args)
    {

    }//end main

}

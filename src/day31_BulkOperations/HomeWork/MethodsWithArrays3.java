package day31_BulkOperations.HomeWork;

import java.util.ArrayList;

public class MethodsWithArrays3 {

    public static String search(ArrayList<String> r, String find)
    {
        String find_tst ="";
        for (int i = 0; i <r.size() ; i++) {
            if(r.get(i).contains(find)){
                find_tst += r.get(i);
            }

        }
        if(find_tst==""){
            find_tst = "search failed";
        }
        return find_tst;



    }//end wineSeller

    public static void main(String[] args)
    {

        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");


        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}

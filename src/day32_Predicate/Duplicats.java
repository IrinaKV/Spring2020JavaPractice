package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;

public class Duplicats {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","A","C","C","D"));
        ArrayList<String> duplicated = new ArrayList<>();

        for (String eachElement:list){
            int count =0;
            for(String each:list){
                if(each.equals(eachElement)) {
                    count++;
                }
            }
            if((count>1)&&(!duplicated.contains(eachElement))){
              duplicated.add(eachElement);
            }
        }
        System.out.println(duplicated);
    }
}

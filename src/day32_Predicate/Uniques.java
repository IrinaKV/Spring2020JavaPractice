package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Uniques {
    public static void main(String[] args) {
        Character[] chars = {'A','A','A','B','D'};
        ArrayList<Character> chList = new ArrayList<>(Arrays.asList(chars));
        ArrayList<Character> result = new ArrayList<>();
        for(Character each:chList){
            int count = Collections.frequency(chList, each);
            if(count==1){
                result.add(each);
            }
        }
        System.out.println(result);



    }
}

package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapMethod {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3));
        Collections.swap(list,2,5);
        System.out.println(list);
        Collections.replaceAll(list, 3,4);
        System.out.println(list);
        Collections.replaceAll(list,4, 5 );
        System.out.println(list);

        ArrayList<String> names= new ArrayList<>();
        names.addAll(Arrays.asList("Omer", "Mary", "Omer","Fatin","Omer"));
        names.set(0,"Irina");
        Collections.replaceAll(names, "Omer", "Irina");
        System.out.println(names);
    }

}

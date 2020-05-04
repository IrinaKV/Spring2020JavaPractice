package day32_Predicate;

import java.util.ArrayList;

public class Quize {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        names.add("Assia");
        if(names.remove("Assia")){
            names.remove("Rick");
        }
        if(names.add("Omar")){
            names.add("Rumb");
        }
        System.out.println(names);

    }
}

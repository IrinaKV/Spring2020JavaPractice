package HomeWork04_28;
import day29_WrapperClass.ValueOf;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class methods181 {
    public static String combineRs(String[] r1,String[] r2) {
        String result="";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < r1.length; i++) {
            list.add(r1[i]);

        }
        for (int i = 0; i < r2.length; i++) {
            list.add(r2[i]);
        }
        for(String each:list){
            result+=each;
        }

        return result;
    }
}

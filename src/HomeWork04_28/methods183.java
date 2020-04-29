package HomeWork04_28;

import java.util.ArrayList;

public class methods183 {
    public static int sum(ArrayList<Integer> ints)
    {
        //write code here
        int sum = 0;

        for (int i = 0; i <ints.size() ; i++) {
            sum += ints.get(i);
        }
        return sum;

    }

}

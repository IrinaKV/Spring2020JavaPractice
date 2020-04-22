package HomeWork04_20;

import java.util.Arrays;

public class MethodwithReturn1 {
    public static int  count_appearance(String[] arr, String t)
    {
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            while (arr[i].equalsIgnoreCase(t)){
                count++;
                arr[i] = arr[i].replaceFirst(t, "");
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"a","foo","bar","foo","bla"};
        String some_string = "foo";
        System.out.println(count_appearance(arr,some_string ));

    }

}

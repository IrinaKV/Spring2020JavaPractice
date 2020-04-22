package day20_ArrayContinue;
import java.util.Arrays;

public class ArraysEquals {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean result = Arrays.equals(arr1, arr2);
        System.out.println(result);

        System.out.println("-------------------------");
        String  st = "Irina Kiseleva";
        char[] ch = st.toCharArray();

        //Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));


        String str1 ="Scool Cybertek ";
        String str2 =" Cybertek Scool";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean result1 = Arrays.equals(ch1,ch2);
        System.out.println(result1);

        System.out.println(str1.split("oo",5));



    }
}

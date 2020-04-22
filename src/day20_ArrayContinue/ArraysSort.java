package day20_ArrayContinue;
import java.util.Arrays;
public class ArraysSort {
    public static void main(String[] args) {
        int[] arr1 = {7, 5,4, 6, 8};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("First min number is: " + arr1[0]);
        System.out.println("First max number is: " + arr1[arr1.length-1]);

        char[] ch = {'s', 'r', 'e', 't', 't', '3', '8', '9'};
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[] names = {"Alla", "Denis", "Kamila", "Ira", "Ally"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));


        int[] arr = {5, 5, 6, 77, 11, 77};
        Arrays.sort(arr);
        int[] arrDesc = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >=0 ; i--) {
            arrDesc[j]=arr[i];
            j++;

        }
        System.out.println(Arrays.toString(arrDesc));
    }
}

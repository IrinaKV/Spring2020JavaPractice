package day22_Arrats_Loops;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String arr[] = new String[5];
        for(int i=0; i< arr.length; i++){
            arr[i] = scan.next();

        }
        System.out.println(Arrays.toString(arr));

        for(String eachElement:arr){
            String str = eachElement.substring(0,2);
            System.out.println(str);
        }


    }
}

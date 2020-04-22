package day22_Arrats_Loops;

import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[100];

        for (int i =0; i<100 ;i++ ){
            numbers[i]=i+1;
        }
        System.out.println(Arrays.toString(numbers));
        for(int eachElement: numbers){
            if(eachElement%2!=0){
              continue;
            }
            System.out.print(eachElement+ " ");
        }
    }
}

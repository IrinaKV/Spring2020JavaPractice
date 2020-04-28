package day29_WrapperClass;

import java.util.Arrays;

public class WrapperClass_Practice {
    public static void main(String[] args) {
       String [] arr= {"2.3", "4.5", "6.7", "7.8"};
        double max = Double.MIN_VALUE;

        for(String each: arr){
            double num  = Double.parseDouble(each);
            if(num> max){
                max=num;
            }

        }
        System.out.println(max);
        String [] arr1= {"2.3", "4.5", "6.7", "7.8"};
        double[] numbers = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            numbers[i] = Double.parseDouble(arr[i]);
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}

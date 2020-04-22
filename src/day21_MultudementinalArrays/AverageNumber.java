package day21_MultudementinalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");
        double[] arr ={10, 20, 33, 40,50, 60,70};
        //average: sum all numbers / length
        int lenth = arr.length;
        double sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println(DF.format(sum/lenth));

    }
}

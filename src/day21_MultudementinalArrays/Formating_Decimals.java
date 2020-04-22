package day21_MultudementinalArrays;

import java.text.DecimalFormat;

public class Formating_Decimals {
    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");
        double a  = 10.0/3.0;

        System.out.println(DF.format(a));
    }
}

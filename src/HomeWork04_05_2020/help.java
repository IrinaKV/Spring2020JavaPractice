package HomeWork04_05_2020;

import java.text.DecimalFormat;
import java.util.Scanner;

public class help {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.00");
        double c = 23.789900054;
        c = Double.parseDouble(f.format(c));
        int premium = scan.nextInt();
        premium+= 0.2*premium;
        System.out.println(premium);

    }
}

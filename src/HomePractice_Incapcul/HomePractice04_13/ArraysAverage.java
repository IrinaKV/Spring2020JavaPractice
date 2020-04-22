package HomePractice_Incapcul.HomePractice04_13;

import java.util.Scanner;

public class ArraysAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        k=temps.length;
        for (int i = 0; i <temps.length ; i++) {
            total+= temps[i];

        }
        System.out.println(total/k);

    }
}

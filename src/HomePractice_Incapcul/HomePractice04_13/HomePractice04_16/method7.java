package HomePractice_Incapcul.HomePractice04_13.HomePractice04_16;

import java.util.Scanner;

public class method7 {

    public static void plus_minus(int[] arr) {
        int countPosit = 0;
        int countNegat = 0;
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                countPosit++;
            }else if(arr[i]<0){
                countNegat++;
            }else {
                countZero++;
            }

        }
        System.out.print("positives:" +countPosit);
        System.out.print(", negatives:" +countNegat);
        System.out.print(", zeros:" + countZero);

    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);

    }



}

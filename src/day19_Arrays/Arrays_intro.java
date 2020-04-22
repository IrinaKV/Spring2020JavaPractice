package day19_Arrays;

import java.util.Arrays;

public class Arrays_intro {
    public static void main(String[] args) {
        int[] score = {70,75,85,90,95,100};
        System.out.println(score[5]);

        String[] name = {"Mike", "Adam", "Tonny", "John","Ammy"};
        System.out.println(name[2]);

        for (int i = 0; i <=name.length-1 ; i++) {
            System.out.print(name[i] +" ");
        }
        System.out.println();


        int[] arr = new int[6];
        arr[0]= 3;
        arr[1]= 7;
        System.out.println(Arrays.toString(arr));
    }
}

package day21_MultudementinalArrays;

import java.util.Arrays;

public class MultidementinalArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3};

                      //  0 1 2    0 1 2    0 1 2    0  1 2
        int[][] arr2D = {{1,2,3}, {4,5,6}, {1,2,3} ,{1,2,3}};
                     //    0        1        2         3

        System.out.println(arr2D.length);
        int[] arr1D = arr2D[1];
        System.out.println(Arrays.toString(arr1D));

        System.out.println(arr2D[0][0]);
        for(int[] eachElement:arr2D){
            System.out.println(Arrays.toString(eachElement));
        }

        int[] oneArray = arr2D[0];
        System.out.println(Arrays.toString(oneArray));


    }
}

package day21_MultudementinalArrays;

import java.util.Arrays;

public class DeepToString {
    public static void main(String[] args) {
        int[] arr1D ={1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr1D));
        int[][] arr2D ={{2, 3, 4, 6},{8,5,7,8,9},{8,5, 6, 7,0}};

        System.out.println(Arrays.deepToString(arr2D));
        System.out.println(Arrays.toString(arr1D));
        //                   0 1 2    0 1 2 3   0 1 2     0 1 2   0 1 2     0 1 2   0 1 2   0 1 2 3
        int[][][] arr3D = {{{1,2,3,},{2,4,5,6},{3,4,5}},{{1,9,10},{0,5,4}},{{0,3,6},{5,6,0},{2,4,6,8}} };
        //                    0         1         2         0       1        0         1       2
        //                              0                       1                    2

        System.out.println(Arrays.deepToString(arr3D));


        System.out.println(arr3D[1][0][2]);
        System.out.println(Arrays.toString(arr3D[1][0]));



    }
}

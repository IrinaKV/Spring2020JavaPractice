package day05_Unary_operations;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        {
            int[] arr = {777,0 , 3, 2,1, 2, 1, 4, 55, 666, 777,55, 1004, 0,4};
            Arrays.sort(arr);
            for (int index1 = 0; index1 < arr.length-1; index1++) {
                if (arr[index1] == arr[index1 + 1]) {
                    if(index1 ==0) System.out.print(arr[index1]);
                    else if (arr[index1]!= arr[index1-1]) {
                        System.out.print(arr[index1] + " ");
                    }

                }

            }
        }
    }
}




/*              for (int i=0; i<arr.length; i++) {
                    for (int j=i-1; j>0; j--) {
                        if (arr[i] == arr[j]) {
                            counter--;
                            break;
                        }
                    }

                System.out.print("The number is " + counter);
            }
 */
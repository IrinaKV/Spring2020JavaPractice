package HomeWork04_21;

import java.util.Scanner;

public class Methods14_printUnique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
            for (int eachNums:nums){
                int count=0;
                for (int eachNumber:nums){
                    if(eachNumber==eachNums){
                        count++;
                    }

                }if(count==1){
                    System.out.println(eachNums);
                }
            }

    }

}

package HomePractice_Incapcul.HomePractice04_13;

import java.util.Scanner;

public class Arrays_CountIvenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int count =0;
        for(int eachNum:nums){
            if(eachNum%2!=0){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}

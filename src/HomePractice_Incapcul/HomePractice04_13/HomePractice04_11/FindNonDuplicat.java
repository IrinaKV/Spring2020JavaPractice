package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class FindNonDuplicat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i < nums.length ; i++) {
            int count =0;

            for (int j=0; j < nums.length ; j++) {

                if(nums[i]==nums[j]) count++;
            }
            if(count<2)
                System.out.println(nums[i]);

        }
    }

}

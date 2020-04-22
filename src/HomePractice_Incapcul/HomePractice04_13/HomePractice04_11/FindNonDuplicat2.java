package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class FindNonDuplicat2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        for (int i = 0; i < nums.length; i++) {
            int count =0, step =0;

            do {

              if(nums[i]==nums[step]){
                count++;
              }
                step++;

            }while (count < 2 && step < nums.length );

            if (count < 2)
            System.out.println(nums[i]);
        }

    }
}

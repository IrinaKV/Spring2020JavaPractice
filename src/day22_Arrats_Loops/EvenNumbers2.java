package day22_Arrats_Loops;

public class EvenNumbers2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = numbers[i].length-1; j>=0 ; j--) {
                int num = numbers[i][j];
                if(num%2==0){
                    System.out.print(numbers[i][j]+" ");
                }

            }

            System.out.println();
        }
    }
}

package day22_Arrats_Loops;

public class Even_nested {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };
        int countOdd = 0;
        int countEven =0;

        for (int[] each1DNumbers: numbers){
            for(int eachElements : each1DNumbers){
                if(eachElements%2==0){
                    countEven++;
                    System.out.print(eachElements+ " ");
                }else{
                    countOdd++;
                }
            }

        }
        System.out.println();
        System.out.println("Total Odd number is: " + countOdd);
        System.out.println("Total Even numbers is:" + countEven);
    }
}

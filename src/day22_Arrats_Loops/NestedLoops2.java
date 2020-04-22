package day22_Arrats_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers = {{9,7,6},{7,89,90},{45,78,56,89},{34,78,8,9},{3,56,-90,-8}};
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                System.out.print(numbers[i][j]+" ");
            }

            System.out.println();
        }
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = numbers[i].length-1; j>=0 ; j--) {
                System.out.print(numbers[i][j]+" ");
            }

            System.out.println();
        }
    }
}

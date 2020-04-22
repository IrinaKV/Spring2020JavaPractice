package day22_Arrats_Loops;

public class Nested_ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int each : arr){
            System.out.println(each);
        }
        int[][] arr2D = {{12,23,23}, {78,23,56,0},{34,56,2}};
        for(int[] each1Darray :arr2D){
            for(int eachArray :each1Darray){
                if(eachArray%2==0){
                    System.out.print(eachArray+" ");
                }
            }
            System.out.println();
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
        char[][] ch2D = {{'a', 'b', 'f'}, {'s', 'r', 'e', 'u'},{'W','T','E','O'}};
        for (char[] each1DArray:ch2D){
            for(char eachElement:each1DArray){
                System.out.print(eachElement+ " ");
            }
        }
        System.out.println();
        System.out.println("____________________________________________");
    }

}

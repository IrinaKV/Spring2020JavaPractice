package day27_DateTime;

public class Find_Minimum {
    public static void main(String[] args) {
        int[] arr = {2,5,4,6,3,7,2,9,-9};
        int min= arr[0];
        for (int each :arr){
            if(each< min){
                min = each;
            }
        }
        System.out.println(min);
    }


    public static  int minimum(int[] arr ){
        int min = arr[0];
        for (int each :arr){
            if(each< min){
                min = each;
            }
        }
        return min;
    }
    public static  double minimum(double[] arr ) {
        double min = arr[0];
        for (double each : arr) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}

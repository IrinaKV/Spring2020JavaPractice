package day26_MethodOverloading;

public class OverloadingMethod {

    public static void main(String[] args) {
        sum(5,6,34,-34);

    }

    public static void sum(int a, int b){
        System.out.println(a +b);

    }
    public static void sum(int a, int b, int c){
        System.out.println(a +b +c);

    }
    public static void sum(int a, int d, int b, int c){
        System.out.println(a + d + b + c);

    }
}

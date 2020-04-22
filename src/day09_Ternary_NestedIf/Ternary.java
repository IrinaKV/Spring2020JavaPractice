package day09_Ternary_NestedIf;

public class Ternary {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }
        // in ternary ? means the if, : else keyword

        String result2 = (num % 2 == 0) ? "Even" :"Odd";
        System.out.println(result2);
        System.out.println("======================================================");


        int num1 = 100;
        int num2 = 200;
        int max = 0;

        int max2 = num1 > num2 ? num1 :num2;
        System.out.println(max2);
        System.out.println("======================================================");
        String str2 = true ? "Hello" : "Hola";
        System.out.println(str2);
        System.out.println("======================================================");


    }


}

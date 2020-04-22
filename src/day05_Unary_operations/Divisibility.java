package day05_Unary_operations;

public class Divisibility {
    public static void main(String[] args) {
        int number = 12840;
        boolean divisibleBy2 = number%2 ==0;
        boolean divisibleBy3 = number%3 ==0;
        boolean divisibleBy5 = number%5 ==0;
        String result1 = number +  " is divisible by 2: " +divisibleBy2;
        String result2 = number +  " is divisible by 3: " +divisibleBy3;
        String result3 = number +  " is divisible by 5: " +divisibleBy5;
        //System.out.println(result1);
        //System.out.println(result2);
        //System.out.println(result3);
        String result = result1 + "\n" + result2 + " \n" +result3 ;
        System.out.println(result);

    }

}

package HomeWork04_21;

import java.util.Arrays;
import java.util.Scanner;

public class method17FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int a =0, b=1, c=0;
        for (int i = 2; i <= num; i++) {
            c = a + b;
            a=b;
            b=c;
        }
        System.out.println(c);

    }


}

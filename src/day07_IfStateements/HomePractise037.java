package day07_IfStateements;
import java.util.*;
public class HomePractise037 {
    public static void main(String[] args) {

        /*
        U have 2 numbers already declared and assigned values.

Using Multi-Branch if statements, check if num1 and num2 are equal, or not. Please follow the below examples and print message accordingly:

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1 > num2){
            System.out.println(num1 + " is greater than " +num2);
        }
        if(num2 > num1){
            System.out.println(num2 + " is greater than " +num1);
        }
        else
            System.out.println( num1 + " and " + num2 +" are equal");

    }
}

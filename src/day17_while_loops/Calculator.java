package day17_while_loops;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i =0; true;){//infinit loop

            System.out.println("Enter first number");
            int num1 = scan.nextInt();

            System.out.println("Enter second number");
            int num2 = scan.nextInt();

            System.out.println("Math operator: ");
            String operator = scan.next();

            if (operator.equals("+")) {
                System.out.println("Addition is: " + (num1 + num2));
            }else if (operator.equals("-")) {
                System.out.println("Subtraction is: " + (num1 - num2));
            }else if (operator.equals("*")) {
                System.out.println("Multiplication is: " + (num1 * num2));
            }else if (operator.equals("/")) {
                System.out.println("Division is: " + (num1 / num2));
            }else if (operator.equals("%")) {
                System.out.println("Ramainder is: " + (num1 % num2));
            }else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Do you want to continue");
            String answer = scan.next();
            if(answer.equalsIgnoreCase("no")){
                System.out.println("thank you for using calculator");
                break;
            }

        }
    }
}

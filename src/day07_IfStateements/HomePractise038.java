package day07_IfStateements;
import java.util.*;
public class HomePractise038 {
    /*
       Using Multi-Branch if statements, check if number is positive, negative or zero.
       Please follow the below examples and print message accordingly:
       10
10 is positive

Enter a number:
-55
-55 is negative

Enter a number:
0
it is zero
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if(number > 0){
            System.out.println(number + " is positive" );
        }
        if(number < 0){
            System.out.println(number + " is negative");
        } else if (number == 0){
            System.out.println(number + " is zero");
        }


    }
}

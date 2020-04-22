package day14_StringClass;

import java.util.Scanner;

public class Burger {
    /*
    a fast food company has two main order types, burger meal and chicken meal.
both have the same prices.
so if a cashier enters "burger" or "chicken " he will get the same price

a float : 10.0

this test can be done with one if.

check if in (string variable) equals "burger" or "chicken"  and output the price 10.0

also if input is "soda" output 2.0 (do this with another if)

for example:

in = "burger"

output: 10.0

in = "chicken "

output: 10.0

in = "soda"

output: 2.0

hint or operator in java is  ||
/
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your order burger, chicken and soda");
        String order = scan.next();

        float a = 10.0f,b=2.0f;

        if(order.equals("burger")||order.equals("chicken")){
            System.out.println(a);
        }else if(order.equals("soda")){
            System.out.println(b);
        }
    }
}

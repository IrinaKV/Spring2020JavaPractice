package day20_ArrayContinue;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Array_days {
    public static void main(String[] args) {
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat","Sun"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int attampts =1;
        while (num>7 || num <1){
            System.out.println("Invalid number, please re-enter the number");
            num = scan.nextInt();
            attampts++;
            if(attampts==3 &&(num>7 || num <1))
                System.exit(0);
        }

        String result = days[num-1];
        System.out.println(result);


    }

}

package day17_while_loops;

import java.util.Scanner;

public class While_practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the username");
        String username = scan.next();

        System.out.println("Enter the password");
        String password = scan.next();
        int count= 0;

        while (!(username.equals("cybertek")&& password.equals("cybertek123"))){
            System.out.println("Please, re-enter again");
            System.out.println("Enter your userName");
            username= scan.next();
            System.out.println("Enter your password");
            password = scan.next();

            count++;

            if(count==2 && !(username.equals("cybertek")&& password.equals("cybertek123"))){
                System.out.println("your account is locked");
                break;
            }

        }

        if(username.equals("cybertek")&& password.equals("cybertek123")){
            System.out.println("logged in");

        }


    }
}



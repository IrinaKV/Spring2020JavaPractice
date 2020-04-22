package day14_StringClass;

import java.util.Scanner;

public class Credentilous {

    public static void main(String[] args) {
/*

 */
        String validUserName = "cybertek";
        String validPassword = "cyberschool";

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String inputUserName  = scan.next();

        System.out.println("Enter your password");
        String inputUserPassword  = scan.next();

        if(inputUserName.equals(validUserName) && inputUserPassword.equals(validPassword)){
            System.out.println("Log in successfully");
        }else{
            System.out.println("Invalid credentials");
        }


        //valid password should not contain spaces
        //contain !,_,$



    }
}

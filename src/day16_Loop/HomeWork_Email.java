package day16_Loop;

import java.util.Scanner;

public class HomeWork_Email {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String newEmail = "";

        if(email.contains("_")){
            System.out.println(email);
            newEmail = email.substring(email.indexOf("_")+1,email.indexOf("@"))+ "_"+
                    email.substring(0,email.indexOf("_"))+ email.substring(email.indexOf("@"));

        }else{
            newEmail = email;

        }


        System.out.println(newEmail);

    }
}

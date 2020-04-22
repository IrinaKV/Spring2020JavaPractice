package day16_Loop;

import java.util.Scanner;

public class HomeWork_Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String fistName = "";
        String lastName= "";
        String domain = "";
        String domanLevel = "";

        fistName = email.substring(0,1).toUpperCase().
                concat(email.substring(1,email.indexOf("_")));
        lastName = email.substring(email.indexOf("_")+1, email.indexOf("_")+2).toUpperCase()+
                email.substring(email.indexOf("_")+2,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        domanLevel = email.substring(email.indexOf(".")+1);

        System.out.println("First name: " +fistName);
        System.out.println("Last name: "+ lastName);
        System.out.println("Domain: " +domain);
        System.out.println("Top-Level Domain: " + domanLevel);



    }
}

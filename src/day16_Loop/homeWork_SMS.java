package day16_Loop;

import java.util.Scanner;

public class homeWork_SMS {
    /*

 Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programing and problem solving}
/
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String message = scan.nextLine();
        String sender;
        String phoneNumber;
        String messageBody;

        sender= message.substring(message.indexOf(":<")+2,message.indexOf(">"));
        phoneNumber = message.substring(message.indexOf(":[")+2, message.indexOf("]."));
        messageBody = message.substring(message.indexOf(":{")+2, message.indexOf("}"));

        System.out.println("Sender: " + sender);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Message body: "+ messageBody);


    }
}

package day14_StringClass;

import java.util.Scanner;

public class HomeWork_SearchName {
    public static void main(String[] args) {
        /*
        Assume that you have only 2 users: Max Payne and Alan Wake.
        First, ask user to enter full name. Display message:
        "Enter full name:". Then take input from user.
        If name is equals to either "Max Payne" or "Alan Wake",
         display message: "User found!". Otherwise,  display message:
         "User not found!". Please make your search case insensitive!

Example:
Display message: Enter full name:
input: Max Payne
Display message: User found!/
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name:");
        String user = scan.nextLine();
        String user1 = "Max Payne";
        String user2 = "Alan Wake";
        user1 = user1.toLowerCase();
        user2 = user2.toLowerCase();
        user = user.toLowerCase();



        if(user1.equals(user) ||user2.equals(user)){

            System.out.println("User found!");
        }else{
            System.out.println("User not found!");

        }




    }


}

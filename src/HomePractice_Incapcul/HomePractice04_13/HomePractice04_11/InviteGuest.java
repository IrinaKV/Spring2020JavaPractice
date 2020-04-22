package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;
import java.util.*;
public class InviteGuest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String listName = "";

        System.out.println("Please enter guest name:");
        String name = input.nextLine();
        listName= name + ", ";
        System.out.println("Do you want to enter new guest name: ");
        String answer = input.nextLine();
        while (answer.equalsIgnoreCase("yes")){
            System.out.println("Please enter guest name: ");
             String name1 = input.nextLine();
             listName+= name1 +", ";
            System.out.println("Do you want to enter new guest name: ");
            answer = input.nextLine();
        }
        listName=listName.substring(0, listName.length()-2);
        System.out.println("Guest's list: " +listName);
    }
}

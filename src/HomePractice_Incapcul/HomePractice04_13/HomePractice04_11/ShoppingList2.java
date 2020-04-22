package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;
import java.util.Scanner;
public class ShoppingList2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;


        do {
            System.out.println("Enter Item" + count + " and its price:");
            item = scan.next();
            price = scan.nextDouble();
            totalPrice += price;
            count++;
            shoppingListReport += item + " Price: " + price;

            System.out.println("Add one more item?");
            scan.nextLine();
            countinue = scan.nextLine();

        } while (countinue.equalsIgnoreCase("no"));

        shoppingListReport = shoppingListReport.substring(0,shoppingListReport.indexOf(' '));
        System.out.println(shoppingListReport);

    }
}

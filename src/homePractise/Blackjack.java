package homePractise;

import java.util.Scanner;

public class Blackjack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Input quantity");

        int house = s.nextInt();
        System.out.println("Input quantity");
        int player = s.nextInt();

        if(player>21){
            System.out.println("bust");
        }else if(house>player){
            System.out.println("player loss");
        }else if(house==player){
            System.out.println("its a tie");
        }else if (player>house){
            System.out.println("player wins");
        }

    }
}

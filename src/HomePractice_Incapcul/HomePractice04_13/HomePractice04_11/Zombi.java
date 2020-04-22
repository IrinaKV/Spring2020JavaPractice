package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;
import java.util.*;
public class Zombi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count = 0;

        while (inhabitants>0){
            System.out.println("Day " +count +" [" + inhabitants +"]");

            inhabitants=inhabitants/2;
            count++;
        }

    }
}

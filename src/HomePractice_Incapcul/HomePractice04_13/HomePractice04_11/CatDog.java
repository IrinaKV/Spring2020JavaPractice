package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;
import java.util.Scanner;
public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        while (word.toLowerCase().contains("cat")){
            countOfCats++;
            word = word.replaceFirst("cat", "");

        }
        while (word.toLowerCase().contains("dog")){
            countOfDogs++;
            word= word.replaceFirst("dog", "");
        }
        if(countOfCats==countOfDogs){
            System.out.println(true);
        }else System.out.println(false);
    }
}

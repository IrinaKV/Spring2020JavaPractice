package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Triple1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        for (int i = 0; i < str.length()-2; i++) {
            if(str.charAt(i)==str.charAt(i+1) && str.charAt(i)==str.charAt(i+2)) {
                count++;
            }

        }
        System.out.println(count);

    }
}

package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Hi_Count {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            int count = 0;

            //str = str.toLowerCase();

            while (str.contains("hi")){
                str = str.replaceFirst("hi", "");
                System.out.println(str);
                count++;
            }
            System.out.println(str);
            System.out.println(count);

        }
}

package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countPython =0;
        int countJava =0;

        while (sentence.contains("python")){
            countPython++;
            sentence= sentence.replaceFirst("python", "");
        }
        while (sentence.contains("java")){
            countJava++;
            sentence= sentence.replaceFirst("java", "");
        }
        if(countJava==countPython){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}

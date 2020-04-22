package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String str1 = str;
        int count=0;
        while (str1.contains("bread")){
            count++;
          str1= str1.replaceFirst("bread","");
        }
        if(count<2){
            System.out.println("nothing");
        }else{
            str = str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
            System.out.println(str);
        }

    }
}

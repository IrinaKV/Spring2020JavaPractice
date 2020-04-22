package HomePractice_Incapcul.HomePractice04_13.HomePractice04_11;

import java.util.Scanner;

public class Triple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE
        String result ="";
        String nonDub = "";
        for (int i = 0; i <str.length()-1 ; i++) {
            if(!nonDub.contains("" +str.charAt(i))){
                nonDub+=str.charAt(i);

            }
        }
        System.out.println(nonDub);
        for (int i = 0; i <=nonDub.length()-1 ; i++) {
            int count1=0;
            for (int j = 0; j <=str.length()-1 ; j++) {

                if(nonDub.charAt(i)==str.charAt(j)){
                    count1++;
                    result = nonDub.charAt(i) +""+ count1 ;

                }
            }

            System.out.print(result);


        }
    }
}

package HomeWork04_21;

import java.util.Scanner;

public class Methods153 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
        printUn2(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        for (String eachWord:words){
            int count=0;
            for(String eachElement:words){
                if (eachElement.equals(eachWord)) {
                    count++;

                }
            }
            if(count==1){
                System.out.println(eachWord);

            }

        }


    }

    public static void printUn2(String[] words){
        String result ="";
        for (int j = 0; j <words.length ; j++) {
            int count =0;
            for (int i = 0; i <words.length ; i++) {
                if(words[i].equals(words[j])){
                    count++;
                }
            }
            if(count==1){
                result += words[j] +"\n";
            }

        }
        System.out.println(result);
    }


}


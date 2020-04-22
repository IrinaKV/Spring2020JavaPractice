package Resources.Library;

import java.util.Arrays;

public class Library {
    public static int[] sortDesending(int[] arr){
        Arrays.sort(arr);  // {1,2,3,4};  ==> {4,3,2,1};
        int[] RevArr = new int[arr.length] ;

        int j = arr.length-1;
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }

        return RevArr;

    }

    public static String Reverse(String str){  // can reverse a string and returns string
        String Reverse = "";

        for(int i = str.length()-1; i >= 0; i-- ){
            Reverse  += str.charAt(i);
        }

        return  Reverse;
    }

    public static int Friquency(String str1, String str2){
        int count = 0;

        while (str1.contains(str2)) {
            count++;
            str1 = str1.replaceFirst(str2, "");
        }
        return count;

    }

    public static String RemoveDuplicates(String str){
        String result =  "";      //AB
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }
        }
        return result;
    }

    public static String FrequencyOfCharacter(String str) {

        String nonDublicat = Library.RemoveDuplicates(str);
        String result = "";

        for (int i = 0; i < nonDublicat.length(); i++) {
            String ch = "" + nonDublicat.charAt(i);
            int num = Library.Friquency(str, ch);
            result += ch + num;
        }
        return result;
    }



}

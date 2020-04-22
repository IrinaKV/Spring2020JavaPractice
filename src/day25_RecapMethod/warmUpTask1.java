package day25_RecapMethod;

public class warmUpTask1 {
    public static void main(String[] args) {



        String str ="abab";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(!result.contains(" "+ ch)){
                result+= ch;
            }

        }
        System.out.println(result);
    }

    public static String RemoveDuplicates(String str){
        String result =  "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i); //B
            if( !result.contains(""+ch) ){
                result += ch;
            }
        }
        return result;
    }
}

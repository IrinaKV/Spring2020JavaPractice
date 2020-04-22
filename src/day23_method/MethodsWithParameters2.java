package day23_method;

public class MethodsWithParameters2 {
    public static void reversAnyString(String word){
        String reverdsWord = "";
        for (int i = word.length()-1; i >=0; i--) {
            reverdsWord +=word.charAt(i);
        }
        System.out.println(reverdsWord);

    }

    public static void main(String[] args) {
        reversAnyString("mama");
    }
}

package day22_Arrats_Loops;

public class JavaPython {
    public static void main(String[] args) {
        String sentence = "I like java and javascrript";
        int countJava = 0;
        int countPython =0;
        String [] words = sentence.split(" ");
        for (String eachWord: words) {
            if(eachWord.contains("java")){
                countJava++;
            }
            if(eachWord.contains("python")){
                countPython++;
            }

        }
        System.out.println(countJava);
        System.out.println(countPython);
    }
}

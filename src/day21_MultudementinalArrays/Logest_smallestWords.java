package day21_MultudementinalArrays;

public class Logest_smallestWords {
    public static void main(String[] args) {
        String[] names = {"Alla", "Irina", "Diana", "Yurii","Eugenii", "Anna"};
        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longgestWord= "";
        String shortestWord= "";
        for (int i = 0; i < names.length ; i++) {
            if(names[i].length()>= maxLengthString){
                maxLengthString=names[i].length();
                longgestWord= names[i];
            }
            if(names[i].length()<=minLengthString){
                minLengthString= names[i].length();
                shortestWord = names[i];
            }
        }

        System.out.println(longgestWord);
        System.out.println(shortestWord);
    }
}

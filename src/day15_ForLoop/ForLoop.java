package day15_ForLoop;

public class ForLoop {
    public static void main(String[] args) {
        String result=" ";
        for (int i = 2; i < 100; i+= 2) {
            result+= i +" ";
        }
        System.out.println(result);
    }
}

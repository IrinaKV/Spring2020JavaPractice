package day17_while_loops;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Java is fun, Java is cool";

        int count =0;
        while (str.contains("a")){
            count++;
            str = str.replaceFirst("a", "");
        }
        System.out.println(count);
    }
}

package day09_Ternary_NestedIf;

public class Ternary_Practice {
    public static void main(String[] args) {

        int number = 0;
        char ch1 = number > 0 ? '+': number< 0 ? '-': '0';
        System.out.println(ch1);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");

        byte score = 10;
        String grade = score>=90 && score <= 100 ? "Excellent" :score>=80 && score < 90 ? "Great":
                        score>=60 && score < 70 ? "Pass": score< 60 && score>0 ? "Failed": "Invalid";
        System.out.println(grade);
    }
}

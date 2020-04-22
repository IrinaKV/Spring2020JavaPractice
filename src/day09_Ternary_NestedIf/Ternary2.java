package day09_Ternary_NestedIf;

public class Ternary2 {
    public static void main(String[] args) {
        String s = 9>10 ? "9 is greater": " 10 is greater";
        System.out.println(s);

        int age = 20;
        boolean eligibility= (age >= 21)? true : false;
        System.out.println(eligibility);

        int ageOfPerson = 20;
        String  eligibleToVote = ageOfPerson >= 18? " Yes":"No";


    }



}

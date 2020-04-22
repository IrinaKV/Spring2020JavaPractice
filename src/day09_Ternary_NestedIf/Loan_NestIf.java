package day09_Ternary_NestedIf;

public class Loan_NestIf {
    public static void main(String[] args) {
        double salary = 20000;
        byte workHistory = 3;
        if(salary >= 30000){
            if(workHistory>= 2){
                System.out.println("You are qualified for loan");
            }else{
                System.out.println("You must have been on job at least 2 year");
            }

        }else {
            System.out.println("You must earn at least $30000");
        }

    }
}

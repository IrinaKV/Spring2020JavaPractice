package day07_IfStateements;

public class If_Else_Statements {
    public static void main(String[] args) {
        int number = -4;
        if(number>= 0){
            System.out.println(number +" is positive");
        } else {
            System.out.println(number +" is negative");
        }

        int age = 30;
        if(age >= 21){
            System.out.println("Here is your Vodka");
        } else {
            System.out.println("Go home kid");
        }

        boolean testedPositiveForCorona = false;
        if(testedPositiveForCorona){
            System.out.println("Buy more toilet paper and stay home");
        } else {
            System.out.println("Do more coding");
        }
    }
}

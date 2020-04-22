package day08_IfStatement;

public class MultiBranch {
    public static void main(String[] args) {
        int a = 100;
        boolean zero = a==0;
        boolean negative = a<0;
        if(zero){
            System.out.println("Zero");

        }
        else if(negative){
            System.out.println("Negative");
        }
        else {
            System.out.println("Pozitive");
        }
    }
}

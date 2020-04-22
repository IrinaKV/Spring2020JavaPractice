package day07_IfStateements;

public class MinNumber {
    public static void main(String[] args) {
        double a = 10000.9;
        double b = 200;
        double c = 200.6;
        boolean aMinNumber = a < b && a< c;
        boolean bMinNumber = b < a && b< c;
        boolean cMinNumber = c < b && c< a;

        if(aMinNumber){
            System.out.println(a + " is minimum number");
        }
        if (bMinNumber){
            System.out.println(b + " is minimum number");
        }
        else if(cMinNumber){
            System.out.println(b + " is minimum number");
        }

    }
}

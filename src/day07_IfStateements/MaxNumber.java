package day07_IfStateements;

public class MaxNumber {
    public static void main(String[] args) {
       double a = 500.2;
       double b = 200.5;
       double c = 300.7;
       boolean aGreader = a > b && a > c;
       boolean bGreader = b > a && b > c;
       boolean cGreader = c > b && c > a;

       if(aGreader){
           System.out.println(a + " is max number");
       }
       if(bGreader){
           System.out.println(b +" is max number" );
       }
       else if(cGreader){
           System.out.println(c +" is max number");
       }

    }
}

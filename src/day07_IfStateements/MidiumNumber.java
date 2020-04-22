package day07_IfStateements;

public class MidiumNumber {
    public static void main(String[] args) {
        double a = 250.2;
        double b = 200.5;
        double c = 300.7;
        /*
         a: (a<b && a>c)or(a<c && a>b)
         b: (b<c && b>a)or (b<a && b>c)
         c: (c<b && c> a)or(c>b && c< a)
        */
        boolean aMedium = (a<b && a>c) || (a<c && a>b);
        boolean bMedium = (b<c && b>a) || (b<a && b>c);
        boolean cMedium = (c<b && c>a) || (c>b && c<a);

        if(aMedium){
            System.out.println(a + " is a medium number");

        }
        if(bMedium){
            System.out.println(b + " is a medium number");

        }
        if(cMedium){
            System.out.println(c + " is a medium number");

        }



    }
}

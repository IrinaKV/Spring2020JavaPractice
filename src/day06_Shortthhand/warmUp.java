package day06_Shortthhand;

public class warmUp {
    public static void main(String[] args) {
        double numberOfGalons = 4.789;
        double galonsToLiters = numberOfGalons * 3.785;
        String  result = numberOfGalons + " gallons is equal to: " + galonsToLiters;
        System.out.println(result);


        System.out.println("======================================================");

        double numberOfLiters = 1;
        double litersToGalons = numberOfLiters/3.785;
        String result2 = numberOfLiters + " liters equal to " + litersToGalons;
        System.out.println(result2);

        System.out.println("======================================================");
         int a = 200;
         int b = -a++ + - --a * a--%2;
         // b = -200 + -200*200%2
        //  b = -200 + 0
       //b = -200
        System.out.println(b);
        System.out.println(a);

        System.out.println("======================================================");
        int x=300, y = 400;
        int z = x +y -x *y +x/y;
        // 300 + 400 -300*400 + 300/400
        // 700 -120000 + 0
        // -11930


    }
}

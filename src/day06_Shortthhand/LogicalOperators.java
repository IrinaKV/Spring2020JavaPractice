package day06_Shortthhand;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result = true;
        System.out.println(!result);//false


        boolean result2 = !(10 +15 >15); //false
        boolean result1 = 10 +15 >15;//true
        boolean result3 = !true == !false; //false

        //&&: and logic

        boolean R1 = "Corona Virus" != " End of the Wordl" && "paper"=="paper";//true
        boolean R2 = 10>15 && 15<13;//false
        System.out.println(R1);
        System.out.println(R2);

        boolean R3 = 'a'=='b' -1 &&'b' +1 =='c';
        // 97==98-1 && 98 +1 =99 true

        /* ||: or logic
        */
        boolean R4 = true!= false ||  false== !true;
        //true || true => true

        boolean R6 = !!!false;
        // !!true -> !false -> true
        float    a   =  100.987_6543f;
        short  b  =  (byte) a ;

        byte  c   = (byte) b;
        System.out.println(c);
        //byte a10 = 20;
        int a9 = 3,  b9 = 2;

        long c9 = (a9+b9) * 2 / 3 % 2 ;
        System.out.println(c9);

        //double b3 = a3/2.0  +  a3++  +  --a3 *  a3 * 3  + 100;

        //System.out.println(b3);





    }


}

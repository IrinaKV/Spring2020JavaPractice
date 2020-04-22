package day05_Unary_operations;

public class PrimitiveCasting {
    public static void main(String[] args) {
        int a =10;
        long b = a;   //b =10l;
        int c = (int)b;//explicit casting

        int a1 = 100;
        long b1= (long)a1;//implicit casting

        double Dnum = 5.5;
        float Fnum = (byte) Dnum;
        System.out.println(Fnum);
        double D1 = 10.5;
        long L1 = (long) (float)D1;
        long L2 = (int)D1;
        long L3 = (long)Dnum ;
        System.out.println(L2 + "\n" + L1 + "\n"+ L3);

      float F1 = 60.5f;
      int I1 = (int) F1;
        System.out.println(I1);


        long  largeNum = 99999999999l;
        int intNum = (int)largeNum;
        System.out.println(intNum);// different is out of int range


        char ch1 = 'a';
        short sh1 = (short)ch1;

        System.out.println(sh1);//97


        char ch2 = 23456;
        double dbl1 = ch2;
        System.out.println(ch2 + "\n" +dbl1);

        int z1 = 10;
        short s1 = (short) z1;
        double t1 = z1;//10.0


        //byte<short<int< long<float<double

      double a5 = 3.2;
      long l5 = (long) a5;

      long l6 =12l;
      double d5 =l6;

    }
}

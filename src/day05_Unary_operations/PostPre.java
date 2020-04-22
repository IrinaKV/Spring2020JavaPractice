package day05_Unary_operations;

public class PostPre {
    public static void main(String[] args) {

        //pre
        int a = 100;
        System.out.println(++a);//101
        System.out.println(a);//101

        int b = 100;
        System.out.println(--b);//99
        System.out.println(b);//99

        // post: fist passes the current value, then eventually changes the variable value
        int A = 100;
        System.out.println(A++);//100
        System.out.println(A++); //101

        int B = 100;
        System.out.println(B--);//100
        System.out.println(B--);//99

        int z = 10;
        int x =++z;//z =11, x=11

        int s = 10;
        int f = s++;//10

        double t1 = 3.5;
        double t2 = t1--;//3.5
        System.out.println(t2);//2.5


        int num =35;
        System.out.println(num++);//35
        System.out.println(num--);//36

      int c = 50;
      c = --c +c++ +c-- + c++;
      //  49+    49 +50 +49 //197

       int c1 =1;
       c1 = -c1-- + c1++/-c1--*--c1;//-1
        //  -1 + 0/-1*-1
        //  -1
        System.out.println(c1);






    }
}

package day06_Shortthhand;

public class SortHandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10; //x = x+20
        System.out.println(x);
        x += 60;
        System.out.println(x);

        String school = "Cybertek";
        school += 12345;
        System.out.println(school);
        System.out.println('a' + 'b'); // 97 +98

        char ch1 = 'a';//97
        ch1 += 'b';//98
        // char ch1 195
        System.out.println(ch1);//character


        int num = 'z';// num = 122
        num+= 'x';//num = num +120
        //122 +120 = 242
        System.out.println(num);

        System.out.println("==============================");
         int A = 100;
         A-= 90;// A = A - 90 = 10
        System.out.println(A);//10

        int B = 200;
        B-= 20;  // B = B-20 = 200-20 =180
        System.out.println(B);

        System.out.println("==============================");
        int a = 2;
        a*= 3;//a= a*3
        System.out.println(a);//6

        int b = a*= 10;// b= a = a*10 =60
        System.out.println(b);//60
        System.out.println(a);//60

        int a1 =100;
        int b1 = (a1*= 2 )+ ++a1;
        // b1 = 200 + 201 = 401
        System.out.println(b1);
        int x1 = 10;
        int y = x1 += 10*2;// x1 = x1 +20 , 30


        int q =20;
        int p = q*= 20*3;
        // q *= 60 q =q*60

        int num1 = 300;
        num1 /=2;//150

        int num2 = 400;
        num2/= 20+10;//num2 = num2/30, 400/30 13.123
          //num2 =13
        System.out.println(num2);

      //  %=,
        int a4 = 300;
        a4%=10 +20; //a%= 30, a4 = a%30 = 300%30 = 0

        int n1 = 400;
        n1 %= 3*5;//n1 = n1%15 = 400%15
        System.out.println(n1);





    }
}

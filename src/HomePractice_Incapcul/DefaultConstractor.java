package HomePractice_Incapcul;
class s{
    public  void method1(){
        System.out.println("1");
    }
}

public class DefaultConstractor {

    public  void method2(){
        System.out.println("2");
    }
    public static void main(String[] args) {

      s obj = new s();
        obj.method1();
        //obj.method2();

    }

}

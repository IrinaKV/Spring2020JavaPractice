package HomePractice_Incapcul;

class H {
    public static void methodH(){
        System.out.println("H");
    }

}
class G extends H {
public static void methodG(){
    System.out.println("G");
}
}


public class InheritanceReveiw extends G {
    /*
    public static void methodH(){
        System.out.println("H");
        public static void methodG(){
    System.out.println("G");
}
    }
     */
   public static void methodC(){
       System.out.println("C");

   }

    public static void main(String[] args) {
      methodC();
      methodH();
      methodG();
    }
}

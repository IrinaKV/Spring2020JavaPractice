package HomePractice_Incapcul;

class TestBase{
     static String chromeDriver= "Chrome";  //default
    public static void TakeScreenShot(){
        System.out.println("Took screenshot");
    }

}



public class Enheritance extends TestBase {
           // sub                 super
         //sub class is gonna inherit allthe visible or protected features from supper class
           public static void main(String[] args) {
               System.out.println(chromeDriver);
               TakeScreenShot();


           }
}

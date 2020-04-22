package HomeWork04_20;

public class MethodWithReturn7 {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
    if((a==true && b==true)||c==true){
        return true;
    }else return false;


    }//

    public static void main(String[] args) {
        threeLocks(true, false, false);
    }

}

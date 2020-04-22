package HomeWork04_20;

public class MethodsWithReturn160 {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        if(toBe == false && notToBe==false){
            return false;
        }else return true;

    }

    public static void main(String[] args) {
        System.out.println(hamletQuote(false, false));
    }

}

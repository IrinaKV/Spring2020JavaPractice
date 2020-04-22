package day24_ReturnMethod;

public class MetodWithReturn {
    public static int max(int x, int y){
        if(x >y){
            return y;
        }else return x;

    }
    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        }else return false;
    }

    public static String c_profits (int buyPrice,int sellPrice){
        if((sellPrice-buyPrice) > 0){
            return "profit";
        } else if((sellPrice-buyPrice) < 0){
            return "loss";
        }else return "no loss";
    }
}

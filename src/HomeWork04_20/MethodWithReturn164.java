package HomeWork04_20;

public class MethodWithReturn164 {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
            if((isAvailable==false || year !=2018 || (year ==2018 && month==7 && day<=8 && day >=1))) {
                return false;
            }else return true;
    }

    public static void main(String[] args) {
        System.out.println(simpleRoomBook(true, 7, 2,2018));
    }

}

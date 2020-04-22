package day16_Loop;

public class ContinueStatment {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i==3){
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        for (int i = 1; i <= 20; i++) {
            if(i%2!=0){
                continue;
            }
            System.out.print(i +" ");
        }
    }
}

package day16_Loop;

public class divisibleBy3_5 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i+=2) {

             if(i%3==0 && i%5==0){
                System.out.print(i+ " ");
            }

        }
    }
}


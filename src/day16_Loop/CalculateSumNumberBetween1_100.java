package day16_Loop;

public class CalculateSumNumberBetween1_100 {
    public static void main(String[] args) {
        int sum=0;
        int sum2=0;
        for (int i = 0; i <= 100; i++) {

         if(i%2==0){
             sum+= i;
         }
         if(i%2!=0){
             sum2+=i;
         }

        }
        System.out.println(sum);
        System.out.println(sum2);
}
}


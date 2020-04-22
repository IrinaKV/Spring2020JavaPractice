package HomePractice_Incapcul.HomePractice04_13;

public class PrintEven80to20 {
    public static void main(String[] args) {
        int[] arr = new int[31];
        int j =0;
        for (int i = 80; i >=20; i--) {
            if(i%2!=0){
                continue;
            }
            arr[j] = i;
            j++;
        }
        for(int eachNum : arr){
            System.out.print(eachNum+" ");
        }



    }
}

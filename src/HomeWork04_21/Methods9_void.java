package HomeWork04_21;
import java.util.Scanner;
public class Methods9_void {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        for (int eachNum:arr){
            isPos(eachNum);
        }


    }

    public static void isPos(int num)
    {
        if(num>0){
            System.out.println("positive");
        }else System.out.println("not positive");

    }

}

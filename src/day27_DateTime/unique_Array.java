package day27_DateTime;

public class unique_Array {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,};

        for(int each :arr){
            int count = 0;
            for (int eachElement:arr){
                if(each==eachElement){
                    count++;
                }
            }
            if (count ==1){
                System.out.println(each);
            }

        }


    }
}

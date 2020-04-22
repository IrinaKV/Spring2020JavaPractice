package day23_method;

public class UniqueValues {
    public static void main(String[] args) {
        String[] arr ={"A", "B","A","A","F"};


        for (String each2Element:arr) {
            int count = 0;
            for(String eachLetter :arr){
                if(eachLetter.equals(each2Element)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each2Element);
            }
        }


    }
}

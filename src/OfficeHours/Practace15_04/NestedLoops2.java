package OfficeHours.Practace15_04;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] numbers = {
                {5,4,3,2,1},
                {10,11,12,13,14,15},
                {16,17,18,19,20}
        };
        for(int[] eachnum: numbers){
            for(int eachNums:eachnum){
                if(eachNums%2==0){
                    continue;
                }
                System.out.print(eachNums + " ");

        }


    }
    }
}


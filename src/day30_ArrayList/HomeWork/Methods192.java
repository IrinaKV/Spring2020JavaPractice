package day30_ArrayList.HomeWork;
import java.util.ArrayList;
public class Methods192 {
    public static void main(String[] args) {

    }
    public static void timesTwo(ArrayList<Integer> nums){
        for (int i = 0; i <nums.size() ; i++) {
            nums.set(i, nums.get(i)*2);
        }
    }
}

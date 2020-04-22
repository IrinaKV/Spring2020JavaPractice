package day21_MultudementinalArrays;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        String[] wildAnimals ={"Tiger", "Lion", "Monkey","Turtle"};
        String[] birds ={"Eagle", "Ducks", "Chicken"};
        String[][] zoo = {wildAnimals, birds};
        //                 0            1
        System.out.println(zoo[1][2]);
        for(String[]eachAnimal:zoo){

            System.out.println(Arrays.toString(eachAnimal));
        }

    }
}

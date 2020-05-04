package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions {
    public static void main(String[] args) {
        // Predicate can be applay
        Predicate<Integer> oddNumber = x -> x%2 !=0;
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("__________________________________");

        Predicate<Integer> lessThan5 = y->y<=5;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(19,2,4,4,5,6,7,8,9,10));
        list2.removeIf(lessThan5);
        System.out.println(list2);
        System.out.println("++++++++++++++++++++++++++++++++++++++");

        ArrayList<String> names  = new ArrayList<>();
        Predicate<String> startWithM = s->s.startsWith("m");
        names.addAll(Arrays.asList("wor","moe","yrt","moy"));
        names.removeIf(startWithM);
        System.out.println(names);
        System.out.println(")))))))))))))))))))))))))))))))))))))))))))");

        Predicate<String> nameWithMOrA= each ->each.startsWith("M") ||each.startsWith("A");
        ArrayList<String> name  = new ArrayList<>();
        name.addAll(Arrays.asList("Alex", "Asia","Muhtar","Dina"));
        name.removeIf(nameWithMOrA);
        System.out.println(name);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        Predicate<Character> digit = c-> c>=48 &&c<=57;
        Predicate<Character> digit1 = c->Character.isDigit(c);
        Predicate<Character> digit2 = c->!Character.isDigit(c);

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','a','4','6','c' ));
        chars.removeIf(digit2);
        System.out.println(chars);
        System.out.println("::::::::::::::::::::::::::::::::");


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(19,2,4,4,5,6,7,8,9,10));
        list3.removeIf(p->p>=5);
        System.out.println(list3);
    }
}

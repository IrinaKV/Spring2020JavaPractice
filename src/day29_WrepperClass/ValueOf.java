package day29_WrepperClass;

public class ValueOf {
    public static void main(String[] args) {
        String str = "123";
        Integer a = Integer.valueOf(str);
        System.out.println(a);

        double b = Integer.valueOf(str);//unboxing
        System.out.println(b);

        String str2 = "15.6";
        double d2 = Double.parseDouble(str2);
        double d1 = Double.valueOf(str2);//unboxing
        Double d3 =Double.parseDouble(str2);
        Double d4 =Double.valueOf(str2);
        System.out.println(d2 == d1);//true
        System.out.println(d2 ==d3);//true
        System.out.println(d1==d4);//true
        System.out.println(d3 ==d4);//false

    }
}

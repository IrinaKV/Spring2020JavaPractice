package day29_WrapperClass;

public class ParseMethod {
    public static void main(String[] args) {
        String str = "123";

        int a1 = Integer.parseInt(str);//123
        System.out.println(str +1);
        System.out.println(a1 +1);

        byte byte1 = Byte.parseByte(str);
        System.out.println(byte1-2);

        Integer I2= (int) Byte.parseByte(str);//autobaxing

        Integer I1 = Integer.parseInt(str);

        String str2 = "10.5";
        float f1 = Float.parseFloat(str2);

        double d1 = Double.parseDouble(str2);

        String str3 = "3147899988775";

        long l = Long.parseLong(str3);
        System.out.println(l);

        Long l1 = Long.parseLong(str3);//autoboxing
    }
}

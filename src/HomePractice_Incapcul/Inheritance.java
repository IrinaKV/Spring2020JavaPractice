package HomePractice_Incapcul;

class Data1{
    public int num1=10;
    protected int num2 = 20;
    private int num3= 30;
    int num4 =40;
    static int staticNum;
    int insNum=70;
    public void mm(){
        System.out.println(this.insNum);
        System.out.println(insNum);

    }
    public static void mmm(){
        System.out.println(staticNum);

    }


}

public class Inheritance extends Data1 {
    public static void main(String[] args) {
        Inheritance obj = new Inheritance();
        System.out.println(obj.num1);
        System.out.println(obj.num2);
        System.out.println(obj.num4);
        mmm();
        obj.mm();

    }

}

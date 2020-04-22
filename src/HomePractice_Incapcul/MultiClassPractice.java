package HomePractice_Incapcul;


class Data{
    public String name;
    private String age;
    String ID;
    protected String DOB;
    public void Hello(){
        //Hola();
        System.out.println("Hello");
    }
    private void Hola(){
        System.out.println("Hola");
    }
    void Aloha(){
        //Hola();
        System.out.println("Aloha");
    }

}


public class MultiClassPractice {
    public static void main(String[] args) {
        Data obj = new Data();
        System.out.println(obj.name);
        //System.out.println(Data.age);
        System.out.println(obj.ID);

        obj.Hello();
        obj.Aloha();
        //obj.Hala();

    }
}

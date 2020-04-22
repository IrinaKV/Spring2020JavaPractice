package HomePractice_Incapcul;

class L {
    String name ="Madina";


    public void methodL(){

    }
    public L(int a){

    }
}

public class SuperKeyword extends L{
    public SuperKeyword(double a){
        super(10);//super class constructor must be called in the sub class
    }

    String name ="Godiva";

    public void method(){
        super.name = "Susana";
        this.name = "Lily";
        super.methodL();
        this.methodL();

    }

}

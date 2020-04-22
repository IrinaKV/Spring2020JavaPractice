package HomeStudy.day49_REcap;

public class Square  extends Shape{

    double side;

    public Square(double side){
        this.side = side;

    }
    @Override
    protected void Area(){
        double Area = side*side;
        System.out.println("Area of square is " + Area);
    }
    @Override
    protected void perimeter(){
        double perimeter = side*4;
        System.out.println("Perimeter of square is " + perimeter );

    }
    @Override
    protected void capacity(){

    }
}

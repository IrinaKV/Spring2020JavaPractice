package HomeStudy.day49_REcap;

public class Rectangle extends Shape {
    double length;
    double weidth;
    public Rectangle(double length, double weidth ){
        this.length = length;
        this.weidth= weidth;
    }

    @Override
    protected void Area(){
        double Area = length*weidth;
        System.out.println("Area of rectangle is " + Area);
    }

    @Override
    protected void perimeter(){
        double perimeter = (length + weidth)*2;
        System.out.println("Perimeter of rectangle is " + perimeter );

    }
    @Override
    protected void capacity(){

    }

}

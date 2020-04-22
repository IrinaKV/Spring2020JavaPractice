package HomeStudy.day49_REcap;

public class Circle  extends Shape{
    double radius;
    final double PI = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    protected void Area(){
        double Area=PI *radius*radius;
        System.out.println("Area of circle is " + Area);
    }
    @Override
    protected void perimeter(){
        double perimeter = PI *2*radius;
        System.out.println("Perimeter of circle is " + perimeter );
    }

}

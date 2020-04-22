package HomeStudy.day49_REcap;


public class Cylinder extends Shape {

    double radius;
    double height;
    final double PI = 3.14;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    protected void Area() {
    double Area =(2*PI*radius*radius)+(height*2*PI*radius);
    System.out.println("Area of cylinder is " + Area);
    }
    @Override
    protected void perimeter(){
        double perimeter = 4*(PI*radius+height);
        System.out.println("Perimeter of cylinder is " + perimeter );
    }

}

package HomeStudy.day49_REcap;



public class Shape {
    protected void Area(){
        System.out.println("Area is 0");

    }
    protected void perimeter(){
        System.out.println("perimeter is 0");
    }
     protected void capacity(){
         System.out.println("volume is 0");
     }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        rectangle.Area();

        Rectangle rectangle1 = new Rectangle(30,40);
        rectangle1.Area();

        rectangle.perimeter();

        Square square = new Square(15);
        square.Area();
        square.perimeter();
        square.capacity();

        Circle circle = new Circle(5);
        circle.Area();

    }
}

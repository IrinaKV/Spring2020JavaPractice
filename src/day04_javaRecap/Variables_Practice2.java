package day04_javaRecap;

public class Variables_Practice2 {
    public static void main(String[] args) {

        double radius = 2.5;
        double PI = Math.PI;
        double area = radius * radius * PI;
        System.out.println("This area of the circle that has a radius of " + radius + " is : " + area);
        System.out.println(" The perimeter of the circle that a radius of " + radius );
        double circle1r = 3;
        double circle2r = 4;
        boolean circle1 = circle1r>circle2r;
        boolean circle2 = circle2r>circle1r;
        System.out.println(circle1);



    }
}

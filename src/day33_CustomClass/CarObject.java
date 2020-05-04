package day33_CustomClass;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.brend= "BMW";
        car1.color= "red";
        car1.brend = "X5";
        car1.year = 2020;
        System.out.println(car1.brend);//instance variable is instance variable
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println("-----------------------------------------------");

        Car car2 = new Car();
        car2.brend = "Toyota";
        car2.model = "Corolla";
        car2.year =2018;
        car2.color = "white";
        System.out.println(car2.brend);//instance variable is instance variable
        System.out.println(car2.model);
        System.out.println(car2.color);
        System.out.println(car2.year);


    }
}

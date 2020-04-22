package HomePractise_Class;

public class HomePractise_Class {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //cat1.breed ="Cebirskaya";
        cat1.setBreed("Cebirskaya");
        //cat1.color = "red";
        //cat1.name = "Sosisya";
        cat1.setName("Sosisya");
        System.out.println(cat1.getName());//Sosisya
        System.out.println(cat1.getBreed());
        //cat1.sex = "Femail";
        //cat1.year = 5;
        //cat1.food = "meat";
        //cat1.name = cat1.color;
        cat1.setInfo("Lili","British", 6, "wight", "femail", "meat");

        //cat1.run();
        //cat1.eat();
        //cat1.getInfo();

        Cat cat2 = new Cat();
        //cat2.name="Enrico";
        cat2.setName("Enrico");
        cat2.getName();
        //cat2.sex ="male";
        //cat2.year =7;
        //cat2.color= "bright red";
        //cat2.breed = "British";
        //cat2.food = "cat Food";


        //System.out.println(cat2.sex);
        //cat2.getInfo();

        //Cat cat3 = new Cat("Lily");

        //System.out.println(cat3.getName());

    }
}

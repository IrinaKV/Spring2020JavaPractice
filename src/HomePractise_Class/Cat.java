package HomePractise_Class;

public class Cat {
    public Cat(){

    }

    public Cat(String name){
    this.name = name;
    }
    private String name;
    private String breed;
    private int year;
    private String color;
    private String sex;
    private String food;

    public void run(){
        System.out.println(name + " can run.");
    }
    public  void eat(){
        System.out.println(name + " loves to eat" + food);
    }

    public void Info(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(year);
        System.out.println(color);
        System.out.println(sex);

    }
    public void setInfo(String name, String breed, int year, String color, String sex, String food  ){
      setName(name);
      setBreed(breed);
      setYear(year);
      setColor(color);
      setSex(sex);
      setFood(food);

    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    public void setYear(int year){
        this.year= year;
    }
    public int getYear(){
        return year;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setSex(String sex){
        this.sex=sex;
    }
    public String getSex(){
        return sex;
    }
    public void setFood(String food){
        this.food = food;
    }
    public String getFood(){
        return food;
    }


}

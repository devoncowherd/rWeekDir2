package Week2.People;

public class Person {
    private String name;
    private int age;
    private double height;


    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(int height){
        this.height = height;
    }
}

package Week2.CarExample;
import Week2.People.Person;

//java warmup
public class Main {
    public static void main(String [] args){
        
        Car honda = new Car();
        honda.start();
        //encapsulation
        honda.setBrand("Honda");
        System.out.println(honda.getBrand());
        
        //
        Person person_1 = new Person("Devon Cowherd",30,172.72);
        System.out.println(person_1.getName());

        //operations
        System.out.println(1 + 1 + "1");

        int x = 10;
        System.out.println(x++);
        System.out.println(x);

        System.out.println(x == x ? "AYAYA" : "B");
    }
    
}

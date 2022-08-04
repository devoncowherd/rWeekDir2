package Week2.Polymorphism;

public class Driver {
    public static void main(String [] args){
        Overrider o1 = new Overrider();
        Overrider o2 = new ChildOverrider();

        int i = 2;
        //parent method
        System.out.println(o1.returnNum(i));
        
        //child overrides it
        System.out.println(o1.returnNum(i));
    }
    
}

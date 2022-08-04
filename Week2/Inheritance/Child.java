package Week2.Inheritance;

public class Child extends Parent
{

    Child(int a){
        super(a);
        System.out.println("Child");
        System.out.println("Here's an example of inheritance. This variable a = " + this.a + " was in the parent class");
        this.a = a;
        System.out.println("This shows that you can now reassign the inherited variable: " + this.a);
    } 
}

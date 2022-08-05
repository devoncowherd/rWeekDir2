
---

# Notes W2D4

---

# Polymorphism

- Another main pillar of OOP
- Poly(many) + morph(shape)
- Types:
    - Compiletime (static)
    - Runtime (dynamic)

### Overloading

- Define multiple methods by changing argument parameters by either type and/or number

### Overriding

- Overriding is used for runtime polymorphism
- These are the exact same method that is found in child class as its parent class with caveats
    - Return type is the same
    - Arguments/Parameters are the same
    - Change the internal behaviour `{}`

### Final

- The `final` keyword in Java is used to restrict the user. Anything `final` becomes constant
- Where?
    - variables
    - methods
    - classes

```java
public class FinalExample {
    public static void main() {
        Cat rosie = new Cat();
        //causes error since the variable is final
        rosie.species = "Doodie. D'aw so Qute!";
    }
}

//causes error since we cannot extend Dragon due to final
class Cat extends Dragon{
    public final String species = "Felis Catus";

    public final void catSound(){
        System.out.println("Meow");
    }
}

//Cat can be extended by default
class Lion extends Cat {
    //while we can overload, we cannot override the final method
    @Override
    public final void catSound(){
        System.out.println("ROAR I'M A LION NOW");
    }
}

final class Dragon(){
    //final class that cannot be inherited
}
```

### Abstraction

- Abstract methods **CANNOT** have function bodies `{}`
    - Normal methods **MUST** have bodies

```java
class Calculator{
    //non-abstract method
    public void addNumber(int a, int b){
        System.out.println("Sum: " + (a + b));
    }

    //abstract version
    public abstract void multiply(int a, int b);

}
```

### Exercise

It's a list of specific programs
Exercises:

1. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name 'message' that prints "This is first subclass" and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.

2. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.Call this method by creating an object of each of the three classes.

3. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students.


---

### Interfaces

- It is a kind of contract with the child class
- Must provide implementation for all interface members
- Interfaces may inherit from other interfaces
- All methods in an interface are abstract

```java
interface Phone{
    void startCamera();
    
    void volumeUp();

    void volumeDown();

    void startBixby();
}


class SamsungUltra implements Phone{
    startCamera(){
        //...implementation
    }
    
    //...implement all other methods in Phone
}
```

- Why interfaces? Use these when a feature ABSOLUTELY requires certain functionality
    - Bank Interface Example:
        - EVERY bank requires a `deposit()`
        - EVERY bank requires a `withdraw()`
        - EVERY bank requires a `getBalance()`


### Interface VS Abstract Classes

- Interfaces are used to achieve 100% abstracation, but abstract classes are used for partial abstraction
- Interfaces can be used for multiple inheritances whereas abstract classes cannot

```java
///multiple implementation
interface A{}

interface B{}

interface C{}

//implemenet multiple with a comma
class D implements A, B, C{}
```

***Create free DMV Test website for students***

- You can perform interface chaining by having interfaces `extends` one another one after another
- `default` = not mandatory to implement
    - *Reminder `protected` can be seen as public to subclasses outside the same package whereas `default` cannot*
- You may use static to use the class directly to call a method!!!
    - **Java 8+**
-  `default` vs `static`
    - default = within package but not directly from the class
    - static = call from anywhere but by class name
- Best Practice = Batch certain interfaces by what you need or leave them individual. Try not to clump everything
- Private methods can be used in interfaces in **Java 9+**

- Further encapsulation for **PRIVATE code**
```java
interface ITest {
    default show(){
        display();
    }

    private void display(){
        //do some stuff
    }
}
```

- But **WHY** default implementations?
    - Plainly, we are forced to implement everything in the interface, so a default implementation already existing doesn't necessarily hurt
    - Personal thought : this somewhat defeats the purpose of having the compiler let the user to make a custom implementation of said interface method, but I see why it may be useful. This can further allow interfaces to be treated as blueprints much like other parent classes

### Encapsulation

- Packages
    - Built-in
    - User-defined
    - (modules/ folders)

- `public` = anywhere
- `default` = packace
- `private` = class only
- `protected` = package || subclass || subclass && outside package
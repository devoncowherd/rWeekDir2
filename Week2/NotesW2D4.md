
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

- 

```java

```
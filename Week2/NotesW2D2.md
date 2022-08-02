
---

# Notes W2D2

### References

- A reference refers to an object in memory, but it is not the object itself. We do not handle object directly in Java - we use references via variables
- Daemon (garbage collector)
    - Automated cleanup of objects 
    - You cannot control it fully
    - You cannot delete the object
    - When? A variable falls out of scope - an object becomes null
    - Active strong references are not eligible for garbage collection

```java
//this cannot be collected by the daemon
Object simpleRef = new Object();
//this may be collected now
simpleRef = null;
```


- Weak references
    - not default and must be explicitly declared
    - There are two levels:
        - Soft = garbage collector will not clear this
        - Phantom = eligible for GC

```java
SoftReference<Integer> reference1 = new SoftReference(number);
```

### Access Modifiers and scope

- Modifiers
    - `public` = accessible anywhere
    - `default` = package
    - `protected` = package-level
    - `private` = class-level 

- `static` = global scope
    - If a class, variable, or method is set to static, the attributes within them may be accessed anywhere
- `@Override`
    - `final` stops overriding
    - * avoid adjusting what other developers declare as `final`
    - Overriding requires the same **signature, return type, parameters, and name**
    - signature = method name

- Overloading
    - The method name is the same, but the signature is different

- `{}` declares a new scope

### Strings
- Strings literals instances of the `String` class
- You do not change strings. They are recreated as new immutable objects each time
- String Pool: 
    - Increases the efficiency of creating new `String` objects
    - It is a lookup table in memory since amassing String objects meant to reference the same thing is inefficient
    - The String pool is checked
    - Do not use the `new` keyword with `String` declaration as it will not use the efficient `String` pool
    - `compareTo()` because they are zero
    
- ***SIDENOTE: JAVA 8 IS THE STANDARD***

### Stringbuilder && StringBuffer
- Javaprovides two classes with mutable strings
    - Stringbuffer
        - Thread safe
        - Less efficient
        - Introduced in Java 1.0
    - StringBuilder
        - StringBuilder Efficiency > StringBuffer Efficiency
        - Not thread safe
        - Java 1.5


```java
StringBuffer buffer = new StringBuffer("Hello");
buffer.append("World");
System.out.println(buffer);
//output = HelloWorld

StringBuilder builder = new StringBuilder("Hello");
builder.append("World");
System.out.println(builder);
//ouput also = "HelloWorld"
```

### Data Structures
- What? Ways of storing and organizing data in computers
- When it is unstructured, there is no defined data model, which is not a good way to handle your data! 🍝

- Some types:
    - Arrays
    ```java
    //array literal
    //takes a consecutive series of memory addresses
    //sections of an alloted space for the array upon creation and is filled as necessary
    //counting the spaces relative distance which is
    //why we start at 0
    int[] array = {1,2,3,4,5,6}
    ```
    - LinkedLists
    - Stacks
    - Queues
    - Hash Tables
    - Trees
    - Heaps
    - Graphs

- Algorithms:
    - Traversal = print all the arrays one by one
    ```java
    //Arrays
    for(int i = 0; i < age.length; i++){
        //traversal
        System.out.println(age[i]);
    }
    ```
    - Searching = looks for an element
    - Insertion = add an element at the given index
    ```java
    //Arrays
    int[] num = new int[10];
    num[5] = 6;
    ```
    - Merging = combining arrays
    - Deletion = removing an element
        - not possible in an array
- Notation? BigO

### Indexing

- `[array.legth - 1]` = last element
- `[0]` = first element
- `array.copyOf(oldArray, oldArray.length - 1);` copies an array
- `type[][] name = {{element,element2},{element,element2}}` multi-dimensional arrays
    - `[1][0]` access second array
    - `[row][column]`

### Varargs

- Where? `String [] args` in main
- `...` 3 dots after data type
```java
//varargs = variable arguments
//3 dots doesn't specify
//you may include other arguments, but you may
//only include one varargs
public void printOutNames(int age,  String... names){
    for(int i = 0; i < names.length; i++){
        System.out.println(names[i]);
    }
}
```


### Testing

- A scenario measuring the functionality across a set of actions or conditions to verify the expected results
- Types:
    - Unit Testing
        - Isolate a bit of developed system works as expected
    - Performance Testing
        - Testing a system under load to see how it handles stress
    - Functional Testing
    - API Testing
        - Postman API
    - Smoke Testing
    - Integration Testing
        - Postman API
    - Regression Testing
    - Unit Testing
        - TDD
        - Mocking
    - User Acceptance Testing
    - System Testing
        - E2E (Automation Testing)
        - Testing to see if the entire system works as a whole
        - Blackbox, white box, gray box
            - Blackbox = not looking in assuming it works
            - Whitebox = looking in the box assuming it doesn't work

- Software Quality
    - Degree of conformance to explicit or implicit requirements and expectations
    - Cheaply, Quickly, or Well 😆
- Testing Levels

### Debugging

- Breadcrumb debugging
    - Leaving a readable trail in the console
    - Quickly mucks up the terminal
- IDE Debugging
    - Use the IDE instead by adding breakpoints and debug mode

### Design Patterns

- Well, the patterns seek to solve a specific problem!
- [Tutorials Point Examples](https://www.tutorialspoint.com/design_pattern/index.htm)

```java
class SingletonItem() {

    private static SingletonItem singletonItem = null;
    private String name;
    private SingletonItem(String name){
        this.name = name;
    }

    public static String getInstance(){
        return this.name;
    }
}
```

- Why use singletons? Resource usage restriction upon devs
- **Immediately Useful:**
    - Builder Pattern
        - Handles customization of item creation in a clean way
    - Factory Pattern
        - Automatically generate items
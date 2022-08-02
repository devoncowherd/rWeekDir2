
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
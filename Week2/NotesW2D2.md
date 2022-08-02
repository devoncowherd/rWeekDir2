
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
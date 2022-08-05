# Notes W2D5

### Exceptions

- Exceptions are events that cause programs to terminate inappropriately

- Keywords
    - `throws`
    - `throw`
    - `try`
        - Wrap risky code
    - `catch`
        - Handle exceptions we catch
    - `finally`
        - Run this regardless of the result

- Types
    - checked
        - These appear at compile time. You won't be able to compile due to these errors
    - unchecked
        - These are runtime exceptions
        - These are far worse than compile-time since they may cause applications at crucial times
            - i.e. `NullPointerException`, `ArithmeticException`,`ArrayIndexOutOfBounds`;
    - error
        - Unrecoverable
        - We will and cannot handle these
        - Types:
            - `OutOfMemory`
            - `VirtualMachineError`

```java 
try{
    viewModelScope(Dispatchers.IO).launch(){
        Response response = repo.getAllData();
        
    }

} catch(Exception e){
    System.out.println();
} finally {
    System.out.println("We attempted an API call!");
}
```

- Custom Exceptions

```java
///bank app example
class InsufficientFundsException extends Exception {
    
    public InsufficientFundsException(){
        System.out.println("Insufficient Funds");
    }


}

class Bank {
    long balance;

    //...

    public void withdraw(int amount){
        if(amount <= balance){
            this.balance = (long)(this.balance - amount);
        } else {
            throw InsufficientFundsException();
        }
    }

    //...
}
```


- `throw` vs `throws`
    - `throw` 
        - is used to throw an exception manually
        - (compiletime)checked exception cannot be propogated using throw only
        - It's followed by an instance
    - `throws` 
        - is used to declare an exception
        - This is used within a method
        - This is followed by a class name

- `final` vs `finally` vs `finalize` 
    - `final` is used to apply restriction upon variables, methods, and classes
        - this is a keyword
    - `finally` is used to execute important code at the end of a `try{}catch(){}` block (optionally)
        - this is a block
    - `finalize` is used to perform cleanup BEFORE an object is garbage collected
        - this is a method
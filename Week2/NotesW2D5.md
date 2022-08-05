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
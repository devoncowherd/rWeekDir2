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

- Top Exceptions
    
    1. `NullPointerException`
    2. `ArrayIndexOutOfBounds`
    3. `StackOverflowException`
    4. `ClassCastException`
    5. `IllegalArgumentException`
    6. `NumberFormatException`
    
### Java IO

```java 
File file = new File("data.txt");
```

- Above, a new instance of the file class is created!
- **Use the following:**
- `File` = file class
- `import java.io.*;` = necessary for library
- `<filename>.createNewFile()` = creates new file
- `<filename>.mkdir()` = creates a directory

- `.list()`
```java
javaString [] list = fileName.list()
```

- `new File("fileName.fileExtension")` or `new File("fileName.fileExtension", <desired subdirectory>)`

```java
//subdirectory example
File dir = new File("db");
//directory created in current directory
dir.mkdir();
File file = newFile("db"), "newFile.fileExtension");

//always wrap file creation in a try/catch in-case the file exists already
try{
    file.createNewFile();
} catch(IOException e){
    e.printStackTrace();
}
```

### Writing to Files

- `FileWriter`
    - Writes to file
    - (Default behavior) Overwrites existing file
    - Constructor 1: `FileWriter fw = new FileWriter(String fileName)`
    - Constructor 2: `FileWriter fw = new FileWriter(File fileName)`
    - Constructor 3: `FileWriter fw = new FileWriter(File fileName, true)` second parameter (true/false) to append
    - Wrap in a `try{}catch(){}` block

```java
File logs = new File("logs.txt");

if(logs.exists()) {
FileWriter fw = new FileWriter(file, true);
//AMAZING! This is a common way .txt logs are created!
fw.write(100);
fw.write("\n");
fw.write("Here's a message~!");
fw.write("\n");
char[] c1 = {'h','e','l','l','o'};
fw.write(c1);
fw.write("\n");

fw.flush();
fw.close();
}
```
- `BufferedWriter` = ?
- `PrintWriter` = ?
- `Scanner(System.in)` = Useful for getting user input

### Typecasting

- Implicit = wider casting
- Explicit = narrow casting
- **Every data type has a different size, so only use the size you need!**
- Hierarchies:
    - unsigned `long` ->signed `long` -> `double` -> `float` -> `int` -> `short` -> `byte` 
- Glass of water analogy...! implicit = higher to lower whereas explicit must be done manually

```java
    //implicitly okay
    long a = 1234.567;
    double b = a;
    int c = a;

    //must be explicity handled now
    b = (double)c;
    a = (long)b;

```

### Wrapper Class

- This is a mechanism to convert primitive types into objects and vice versa
- Boxing/Autoboxing
    - **Automatic** conversion into its corresponding class is known as auto**boxing**
    - **Automatic** conversion into primitive types is auto**unboxing**
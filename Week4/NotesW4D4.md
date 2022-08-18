# Notes W4D4

### Collection Sorting

- `Collections.sort(<thing_to_sort>)`

```java
import java.util.ArrayList;

public class SortingExample {
    public static void main(String [] args){
        ArrayList<Integer> numbers = new ArrayList();

        number.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(-5);
        numbers.add(22);

        System.out.println(numbers);
        //output = [5,2,3,-5,22]

        Collections.sort(numbers);
        System.out.println(numbers);
        //output = [-5,2,3,5,22]
    }
}
```

- You may sort more complex objects by using the `Comparable` interface

### `Comparable`

- `compareTo()`
    - returns an integer value
- Used to order object of user-defined class
- It's in the `java.lang` package
- use the dot operator, and then put the other object in the parenthesis
`compareTo()`
    - `objectOne.compareTo(objectTwo);` //returns int
    - 0 = equal obj
    - 1 = current obj is greater
    - 2 = current obj is smaller


### Lambda

- Syntax
    - `(parameter) -> { expression(s)}`
- consists of...
    - parameters
    - arrow
    - body

### JAVA 8 Stream API

- Collection
    - Represents a group of data
- Stream
    - Processes data from collection
    - ...like a conveyor belt of bits
    - Functional in nature
    - It doesn't change any of the input
- Provides additional package: `java.util.stream`
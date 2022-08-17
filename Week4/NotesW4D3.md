
# Notes W4D3

## Collections

Interface
- Set
- List
- Queue
- Deque

Class
- ArrayList
- Vector
- LinkedList
- HashSet

### Framework

- IT provided readymade architecture
- Represents a set of class and interface

#### Hierarchy

- Iterable Interface
    - It is the root interface for all collection classes
    - facilitates iterating through elements in forward direction only
        - `hasNext()`
        - `next()`
        - `remove()`

### Collection Interface

- It is the interface that is implemented by all the classes

### List Interface

- List interface is the child interface of collection interface
    - ArrayList
        - no size limit

### ArrayList
- Internally uses dynamic arrays 
    - doubles in size when limit is reached and element added
- Can use searches

### LinkedList
- This is node-based (doubly-linked list)
- We cannot use binary search
- Sometimes more efficient than arrays
    - no shifting occurs to add elements
- These can be used as list, stack, or queue

### Sets
- HashSet
    - Is a class used to create a collection that is uses a hash table for storage
- LinkedHashSet
- TreeSet


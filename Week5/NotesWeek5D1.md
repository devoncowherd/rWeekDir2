# Notes W5D1

### Multithreading in Java

- What?
    - Concurrent executions of two or more parts of a program
    - Threads are lightweight processes within processes
    - These are not hardware threads, but they may utilize hardware threads
- Why?
    - Multitasking
    - Multi-processing
    - Some processes take a long time (like network calls) which may freeze the application

### Multitasking

- Is is a process of executing multiple tasks simultaneously 
- We can utilize the CPU to the fullest
- It can be achieved in two ways

1. process-based multitasking
2. thread-based multitasking

### Process-based multi-taasking 

    - Each process has an address in memory
    - Each process allocated a separate memory
    - A process is heavyweight
    - Cost of communication is high
    - Switching between the process is expensive and time consuming

### Thread-based multi-tasking 

- Threads share the same address space
- A thread is lightweight
- Cost of communication is low and time efficient
- Advantages 
    - It doesn't block the user from performing multiple actions on the same process
    - It saves time by performing tasks concurrently
    - Threads are independent, so it doesn't affect other threads

### Thread class

- Create one!
    - using a class that extends it
    - impements a runnable interface

```java
class MultiThreadDemo extends Thread{
    @Override
    public void run(){
        System.out.println("This thread is running...");
    }
}


public class Main {
    public static void main(String [] args){
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        threadDemo.run();
    }
}
```

### You can do that ... OR!


```java
class MultiThreadDemo implements Runnable {
    @Override
    public void run(){
        System.out.println("This is running on another thread...!");
    }
}

public class Main{
    public static void main(String[] args){
        MultiThreadDemo threadDemo = new MultiThreadDemo();
        Thread t1 = new Thread(threadDemo);
        t1.start();
    }
}

```

- Runnable is considered better because it's reusable (it can be extended by any other interface)

### Thread Lifecycle

- Stages:
    - New
    - Runnable
    - Running
    - Terminated 
    - Non-Runnable

- JVM controls the lifecycle of the thread in Java 

### Thread Scheduler

- Part of the JVM
- Decides which thread should be run
- No guarantee which thread will be run at a specific time
- This utilizes time-slicing
- `sleep()`
    - This is used to set aside a task for a specified amount of time
- Even if you extend Thread, if you don't use the `start()` method, and instead you call the methods in the class extending Thread or implementing Runnable, you will cause it to join the stack normally instead of starting a new stack

### Naming Thread

- `getName()` 
    - find the name of the thread
- `setName(name)`
    - use to change the name of the thread
- `getCurrentThread()`
    - return the information of the current thread
- `join()`
    - used to execute one thread completely

### Thread Pool

- A collection of previously created Threads
- Efficiently executes async callbacks
- Reduces the number of application threads
- It's best to recycle threads for efficiency

### Thread Naming

- Call extend the class, name the  
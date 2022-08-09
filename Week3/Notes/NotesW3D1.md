
---

# Notes W3D1

### Generic Classes

- A class hat can refer to any data type is known as a generic class
- We cna use T type parameters to create the generic class of a specific type

- Syntax

```java
class myGeneric<T>{
    T obj;
    void add(T obj){
        System.out.println(1 + 1);
    }
}
```


T = type
E = element
K = key 
N = number 
V = value

### Generic Methods

- Like generic class we can also create generic methods that can accpet any type of parameter - here the scope of the argument is limited to the method where it was declared

- It will allow us to accept any type of parameter

```java
abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing rectangle...");
    }
}

class Circle extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing circle...");
    }
}


class Cone {

}

class Output {
    //only accepts child class of Shape
    public void drawShape(List<? extends Shape> list){
        for(Shape shape : list){
            shape.draw()
        }
    }
}

public class Artist(){

}
```

### Wildcard Generics

- `?`
    - question mark symbol
    - means any type
```java
///...
    <? extends Shape>
    //...
```

### Java 8

- Lambda
    - Lambdas were introduced in Java 9 to help create concise code
    - Why lambda? Less code

- Function interfaces
    - Function interfacts have one abstract method 
    - `@FunctionalInterface` annotation

- Syntax
    - `() -> {}`
    - `(parameters) -> { doSomeStuff(parameters)}`

```java
interface DrawSomething{
    void draw();
}

class Artist implements DrawSomething{
    @Override
    void draw();
}

public class Demo(){
    public static void main(String [] args){
        @Override
        public void draw(){

        }
    }
}
```


- Wait... tihs actually works?!?!?

```java
interface ISayHello(){
    public String sayHello();
}


class MyClass(){
    public static void main(String[] args){
        ISayHello s = () ->  {
            return "Hello World";
        }

        System.out.println(s.sayHello());
}
```

- For lambdas, you actually need to ues those new handydandy function interfaces!

### SOLID Design

- S = single responsibility
    - Each function and class should have a single responsibility...!
    - Do not overencumber methods and classes with duties
- O = open/close principle
    - - Open/close principle - software entities (class, module, function, etc) should be open for extension, but closed for modification
- L = liskov substitution principle
    - Each child class must be a substitute for the parent class
- I = interface segragation principle
    - Do not force any client to implement an interface which is irrelevant to them!
- D = dependency inversion
    - High-level modules should not depend on low-level modules
- Why? 
    - In software development,OOP design play a crucial role when it comes to writing flexible, scalable, maintainable, and reusable code...! The benefits are known to be well worth the OOP pattern. We use SOLID to standardize OOP


```java
//single responsibiity
class Book {
    private String name;
    private STring author;
    private String description;

    public String replaceWordInText(String word){
        return text.replaceAll(word, text);
    }
}

public class BookDemo{
    public static void main(String[]args){

    }
}

```


```java
class Vehicle {
    String brand;
    String model;
    String wheelType;
    int Year;

}

class VehicleInfo extends {
    public void printInfo();
}
```


### SQL 

- Data Types:
    - Numeric
        - tinyint
        - smallint
        - integer
        - float
        - double

    - Date and Time
        - year
        - date
        - time
        - timestamp
    - String
        - char
        - varchar

- Entity
    - Any real...

- **char(50) - character**
    - fixed
    - better cpu performance
- **varchar(50) - varying character**
    - can grow or shrink
    - varchar = better memory efficiency 


### SQL Statements

- DDL Data definition language
- DML data manipulation
- DQL = data query language


### DDL - Data Definition Language

- Create
    - `mysql> create database <database_name>`
    - `mysql> use <database_name>`
    - `mysql> create table <table_name>(<column_name> <column_data_type>, <column_name> <column_data_type>, ...)`
- Drop
- Alter
- Truncate

- cmd
    - `mysql>`
    - `myssql --version`
    //first below
    //everything must end in a semicolon
    //add to system path environment variable
    - `mysql -u root -p`
    - `[password] roo`
    - `mysql> show databases;`
    - `mysql> show tables;`
    -  `mysql> describe <table_name>;`
- Truncate
    - command = `truncate table <table_name>;`
    - `mysql> drop table employee;`
    - `mysql>  create table employee (id integer, name, char(50), email char(50);`

- Insert
    - `insert ignore`
    - // review
- Update
    - `update where`....
    - //review

### DQL

- `select`
    - all rows /all columns
    - all rows /limited columns
    - limit rows /all coluns
    - limited rows /limited columns
```SQL
select * from employee;
insert into employee values(1,"Mark","m@gmail.com");

```
package Generics;

import java.util.*;

class Customer<T>{
    T name;

    public Customer(T name){
        this.name = name;
    }
}

public class AnotherDemo {
    public static void main(String[] args){
        List<Shape> list = new LinkedList();
        Rectangle rect1 = new Rectangle();
        Circle circ1 = new Circle();
        Cone cone1 = new Cone();
        Line line1 = new Line();
        Output output1 = new Output();
        //list.add(rect1,circ1,cone1);
    }
}

abstract class Shape<T> {
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


class Cone extends Shape {
    @Override
    void draw(){
        System.out.println("Drawing cone...");
    }

}

class Line {
    void draW(){
        System.out.println("Drawing line...");
    }
}
class Output {
    //only accepts child class of Shape
    //VERY IMPORTANT WOWWW!
    public void drawShape(List<? extends Shape> list){
        for(Shape shape : list){
            shape.draw();
        }
    }
}



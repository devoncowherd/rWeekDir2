package Generics;

class Calculator<T> {
    T obj1;
    T obj2;
    //GFG
    Calculator(T obj1, T obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public boolean areEqual(){
        if(obj1==obj2){
            return true;
        } else {
            return false;
        }
    }

    public void print(String s){
        System.out.println(s);
    }
    
}

public class Demo1{

    public static void main(String[] args) {
        Calculator calc = new Calculator("A", "A");
        boolean result = calc.areEqual();
        int five = 5;

        Calculator calc2 = new Calculator(5, 5);

        if(result){
            calc.print("isEqual");
        } else {
            calc.print("isNotEqual");
        }

        System.out.println(calc2.areEqual());

    }

    }


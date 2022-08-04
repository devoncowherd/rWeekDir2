package Week2.Polymorphism;

//driver
class Calculation{
    public static void main(String [] args){
        Calculator calc1 = new Calculator();

        calc1.test();
        calc1.test(1, 5);
        calc1.test("Hello", 25);

    }
}

//class to manip
class Calculator{
    public void test(){
        System.out.println("Calc 1");
    }

    //overloaded by parameter number
    public void test(int i, int b){
        System.out.println(i - b);
    }

    //overload by argument type
    public void test(String i, int b){
        System.out.println(i + b);
    }
}
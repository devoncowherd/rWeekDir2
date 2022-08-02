package Week2.Evaluation;

public class Main {
    public static void main(String[] args){

        //triangle tester
        TriangleType tri1 = new TriangleType(3.5,3.5,4.5);
        System.out.printf("%b %b %b",tri1.isEquilateral(),tri1.isIsosceles(),tri1.isScalene());
    }
    
}

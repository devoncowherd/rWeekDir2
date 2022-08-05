package Week2.Exceptions;

public class Divider {

    public static double divide(int a, int b){
        try{
            return (a/b);

        } catch (ArithmeticException e){
            System.out.printf("An exception occurred!\n %s\n", e.toString());
        } 

        return -1;
    }
    
}

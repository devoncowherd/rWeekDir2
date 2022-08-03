package Week2.SimpleCalculator;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int userInput = 0;

        Calculator calc1 = new Calculator();

        
        while(userInput == 0){
            System.out.println("Options:\n 1= add\n 2= subtract\n 3= multiply \n 4= divide");

            try{
            userInput = scan.nextInt();   
            } catch(Exception e){ 
                System.out.printf("An exception occurred: %s",e.toString());
            }
      }

      switch(userInput){
        case 1: 
            System.out.println("Enter two digits to add");
            calc1.add(scan.nextDouble(), scan.nextDouble());
            break;
        case 2: 
            System.out.println("Enter two digits to subtract");
            calc1.subtract(scan.nextDouble(), scan.nextDouble());
            break;
        case 3:
            System.out.println("Enter two digits to multiply");
            calc1.multiply(scan.nextDouble(), scan.nextDouble());
            break;
        case 4:
            System.out.println("Enter two digits to divide");
            calc1.divide(scan.nextDouble(), scan.nextDouble());
            break;
      }

    }
    
}

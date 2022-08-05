package Week2.Exceptions;

public class SpoiledFoodException extends Exception{

    SpoiledFoodException(){
        System.out.println("This food isn't fresh! Time to toss it!");
    }
    
}

package Week2.Exceptions;

public class WrongUsernameException extends Exception{
    WrongUsernameException(){
        System.out.println("Please check your credentials and try again");
    }
}

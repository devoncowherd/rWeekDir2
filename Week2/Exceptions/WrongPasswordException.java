package Week2.Exceptions;

public class WrongPasswordException extends Exception{
    WrongPasswordException(){
        System.out.println("Please check your credentials and try again");
    }
}

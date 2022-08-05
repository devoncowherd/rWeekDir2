package Week2.Exceptions;

class MultipleLoginException extends Exception{
    MultipleLoginException(){
        System.out.println("You're already logged in. Please try refreshing the page.");
    }
}
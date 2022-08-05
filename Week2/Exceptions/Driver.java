package Week2.Exceptions;

public class Driver {
    public static void main(String [] args){

        //single custom exception 
        FreshFood freshFood1 = new FreshFood(false, "apple");
        freshFood1.checkFood();

        //multiple custom exceptions and chaining
        UserOne u1 = new UserOne();
        u1.login("user1", "spaceButler");
        u1.login("user1","remIsBestGirl");
        u1.login("user1", "remIsBestGirl");
    }
    
}

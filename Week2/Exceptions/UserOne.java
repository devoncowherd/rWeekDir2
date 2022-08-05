package Week2.Exceptions;

public class UserOne {
    private boolean loggedIn = false;
    private String password = "remIsBestGirl";
    private String username = "user1";
    
    public void login(String username, String password){
        try{
            if(this.loggedIn == false && username == this.username && password == this.password){
                System.out.println("Successfully Logged In!");
                this.loggedIn = true;
            } else if(username != this.username){
                throw new WrongUsernameException();
            } else if(password != this.password){
                throw new WrongPasswordException();
            } else if(this.loggedIn){
                throw new MultipleLoginException();
            } 
        } catch(WrongUsernameException | WrongPasswordException e){
            System.out.println("Account Credentials Didn't Match");
        } catch(MultipleLoginException e){
            System.out.println("Exception Occurred:" + e.toString());
        } catch(Exception e){
            System.out.println("Something went wrong...!");
        }
    }
}

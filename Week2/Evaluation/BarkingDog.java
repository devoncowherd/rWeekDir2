package Week2.Evaluation;

/**
 * 3. Barking Dog
 * 
 * We have a dog that loves to bark. We need to wake up if the dog is barking at
 * night!
 * 
 * Write a method shouldWakeUp that has 2 parameters.
 * 
 * 1st parameter should be of type boolean and be named "barking". It represents
 * if our dog is currently barking. 2nd parameter represents the hour of the day
 * and is of type int with the name hourOfDay and has a valid range of 0-23.
 * 
 * We have to wake up if the dog is barking before 8 or after 22 hours, so in
 * that case return true.
 * 
 * In all other cases return false.
 * 
 * If the hourOfDay parameter is less than 0 or greater than 23, return false.
 */

public class BarkingDog {
    
    public static void main(String [] args) {
        System.out.println(shouldWakeUp(true, 12));
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        // TODO Write an implementation for this method declaration

        if(isBarking == true){
            if(hourOfDay > 23 || hourOfDay < 8){
                return true;
            }
        }
        return false;
    }
}

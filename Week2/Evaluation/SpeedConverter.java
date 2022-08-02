package Week2.Evaluation;

public class SpeedConverter {

    public static void main(String [] args){
        System.out.println(printConversion(-30));

    }

        /**
     * 1.A Speed Converter - Convert to MilesPerHour
     * 
     * Write a method called toMilesPerHour that has 1 parameter of type double with
     * the name kilometersPerHour. This method needs to return the rounded value of
     * the calculation of type long.
     * 
     * If the parameter kilometersPerHour is less than 0, the method toMilesPerHour
     * needs to return -1 to indicate an invalid value.
     * 
     * Otherwise if it is positive, calculate the value of miles per hour, round it
     * and return it. For conversion and rounding use Math.round().
     */
    
    public static long toMilesPerHour(double kilometersPerHour) {
        // TODO Write an implementation for this method declaration
        if(kilometersPerHour < 0){
            return (long)(-1);
        }
        return (long)(Math.round(kilometersPerHour * 0.621371));
    }


    
    /**
     * 1.B Speed Converter - Print Conversion
     * 
     * Write another method called printConversion with 1 parameter of type double
     * with the name kilometersPerHour. This method needs to return a String and
     * needs to calculate milesPerHour from the kilometersPerHour parameter.
     * 
     * The String should print in the format: "XX km/h = YY mi/h"
     * 
     * XX represents the original value kilometersPerHour. YY represents the rounded
     * milesPerHour from the kilometersPerHour parameter.
     * 
     * If the parameter kilometersPerHour is < 0, then print the text "Invalid
     * Value"
     */

    public static String printConversion(double kilometersPerHour){
        
        if(kilometersPerHour > 0) {
            return kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h";
        }

        return "Invalid Value";
    }



}

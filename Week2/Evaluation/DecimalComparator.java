package Week2.Evaluation;

import java.text.DecimalFormat;

/**
 * 4. DecimalComparator
 * 
 * Write a method areEqualByThreeDecimalPlaces with two parameters of type
 * double.
 * 
 * The method should return boolean and it needs to return true if two double
 * numbers are the same up to three decimal places.
 * 
 * Otherwise, return false;
 */

public class DecimalComparator {


    public static void main(String [] args){

        System.out.println(areEqualByThreeDecimalPlaces(5.22494213,5.2243553));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secondNum) {
        
        boolean result = false;

        //handles narrowing it to 3rd decimal place
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println(df.format(firstNum));
        
        return df.format(firstNum).equals(df.format(secondNum));
	}
}

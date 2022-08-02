package Week2.Evaluation;


/**
 * 16. Armstrong Number
 * 
 * An Armstrong number is a number that is the sum of its own digits each raised
 * to the power of the number of digits.
 * 
 * For example:
 * 
 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
 * a number is an Armstrong number.
 */
public class ArmstrongChecker {

    public static void main(String[] args){
        System.out.println(isArmstrongNumber(154));
    }

    public static boolean isArmstrongNumber(int input) {

        //convert to string and split by digit
        String [] num = String.valueOf(input).split("");
        //hold the result
        double result = 0;

        for(String n : num){
            result += Math.pow(Double.parseDouble(n), num.length); 
        }

        if((int)result == input){
            return true;
        }
        return false;
    }
}

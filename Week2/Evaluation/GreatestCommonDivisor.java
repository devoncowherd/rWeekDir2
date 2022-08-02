package Week2.Evaluation;

/**
 * 8. Greatest Common Divisor
 * 
 * Write a method named getGreatestCommonDivisor with two parameters of type int
 * named first and second.
 * 
 * If one of the parameters is < 10, the method should return -1 to indicate an
 * invalid value. The method should return the greatest common divisor of the
 * two numbers (int).
 * 
 * The greatest common divisor is the largest positive integer that can fully
 * divide each of the integers (i.e. without leaving a remainder).
 * 
 * For example 12 and 30: 12 can be divided by 1, 2, 3, 4, 6, 12 30 can be
 * divided by 1, 2, 3, 5, 6, 10, 15, 30
 * 
 * The greatest common divisor is 6 since both 12 and 30 can be divided by 6,
 * and there is no resulting remainder.
 */


public class GreatestCommonDivisor {
    

    public static void main(String [] args){
        System.out.println(getGreatestCommonDivisor(128,64));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
		//checks for valid input
        int gd = 0;

        if(first < 10 || second < 10){
            return -1;
        }

        for(int i = 1; i <= first && i <= second; i ++){
            if(first % i == 0 && second % i == 0){
                gd = i;
            }
        }

		return gd;
	}

}

package Week2.Evaluation;
import java.util.*;
/**
 * 17. Prime Factors
 * 
 * Compute the prime factors of a given natural number. A prime number is only
 * evenly divisible by itself and 1.
 * 
 * Note that 1 is not a prime number.
 */

public class PrimeFactors {

    public static void main(String [] args){

    }

	public static List<Long> calculatePrimeFactorsOf(long l) {
        List<Long> list = new ArrayList<Long>();

        if(l % 2 == 0){
            list.add((long)2);
        }

        if(l % 3 == 0){
            list.add((long)3);
        }
        for(int i = 5; i <= l; i++){
            if(l % (long)i == 0){
                for(int j = 2; j < i; j++){
                    
                }
            }
        }

        return list;
	}


    
}

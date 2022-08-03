package Week2.Evaluation;
/**
 * 18. Calculate Nth Prime
 * 
 * Given a number n, determine what the nth prime is.
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * If your language provides methods in the standard library to deal with prime
 * numbers, pretend they don't exist and implement them yourself.
 */
public class NthPrime {

    public static void main(String [] args) {
        System.out.println(calculateNthPrime(150));
    }

	public static int calculateNthPrime(int k) {
        //program breaks between the 150th and 200th prime
        //The first primes are 2 and 3

        if(k < 0){
            return -1;
        }
        if(k == 1){
            return 2;
        }
        if(k == 2){
            return 3;
        }
        int count = 2;
        int result = 0;

        //set the limit higher using k
        //the limit will never be reached
        for(int i = 1; i <= k; i++){
            int lower = 6 * i - 1;
            int higher = 6 * i + 1;
            
            //find out if this is actually prime
            boolean isPrime = false;
            for(int j = 2; j < lower; j++){
                if(lower % j == 0){
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime){
                result = lower;
                count++;
                if(count == k){
                    return lower;
                }
            }

            isPrime = false;
            for(int j = 2; j < lower; j++){
                if(higher % j == 0){
                    isPrime = false;
                    break;
                }
                isPrime = true;
            }
            if(isPrime){
                result = higher;
                count++;
                if(count == k){
                    return higher;
                }
            }
        }
        return 0;
    }
}

package Week2.Evaluation;
import java.util.Random;
import java.util.Arrays;

public class ThreeMagicNumbers {
    	/**
	 * 21. Three Magic Numbers
	 * 
	 * You work at a casino in Las Vegas.  Your job is to program a slot machine to
	 * return 3 random numbers using the java.util.Random class.
	 * 
	 * Write a method to return an int array of 3 random numbers between 1 - 100.
	 * Generate the 3 random numbers (1 - 100 inclusive) using the java.util.Random class.
	 */
    public static void main(String [] args){
        int [] set = new int[3];
        int amount = 3;
        System.out.println(Arrays.toString((getSumOfMultiples(amount,set))));
    }

    public static int [] getSumOfMultiples(int a,int[] set) {


        set = new int[a];
        Random rand = new Random();

        for(int i = 0; i < set.length; i++){
            set[i] = rand.nextInt(100);
        }
		return set;
	}
    
}

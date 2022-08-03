package Week2.Evaluation;

public class Pangram {
    	/**
	 * 19. Pangram
	 * 
	 * Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 */

    public static void main(String [] args){
        System.out.println(isPangram("The quick brown fox jumps over the lazy dog."));
    }
	public static boolean isPangram(String string) {


        char [] letters = {'a',
        'b','c','d','e','f','g',
        'h','i','j','k','l','m',
        'n','o','p','q','r','s',
        't','u','v','w','x','y','z'};

        for(char letter : letters){
            if(!(string.toLowerCase().contains(String.valueOf(letter)))){
                return false;
            }
        }
        return true;
	}

}

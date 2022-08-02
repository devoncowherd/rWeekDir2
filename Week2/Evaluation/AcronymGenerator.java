package Week2.Evaluation;

/**
 * 11. Acronyms
 * 
 * Convert a phrase to its acronym. Techies love their TLA (Three Letter
 * Acronyms)! Help generate some jargon by writing a program that converts a
 * long name like Portable Network Graphics to its acronym (PNG).
 */

public class AcronymGenerator {
    

    public static void main(String [] args){
        System.out.println(acronym("Attitude of Gratitude"));
    }

	public static String acronym(String phrase) {

        String [] splitter = phrase.split(" ");

        String concat = "";

        for(int i = 0; i < splitter.length; i++){
            concat += splitter[i].split("")[0];  
        }

		return concat;
	}
    
}

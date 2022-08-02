package Week2.Evaluation;

/**
 * 7. Number In Word
 * 
 * Write a method called printNumberInWord. The method has one parameter number
 * which is the whole number. The method needs to print "ZERO", "ONE", "TWO",
 * ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other
 * for any other number including negative numbers. You can use if-else
 * statement or switch statement whatever is easier for you.
 */

public class NumberInWord {


    public static void main(String[] args){
        printNumberInWord(3);

    }

    public static String printNumberInWord(int number) {		
        
        String result = "";
        
        switch(number){
            case 0: 
                result = "ZERO";
                break;
            case 1:
                result = "ONE";
                break;
            case 2:
                result = "TWO";
                break; 
            case 3:
                result = "THREE";
                break;
            case 4: 
                result = "FOUR";
                break;
            case 5: 
                result = "FIVE";
                break;
            case 6:
                result = "SIX";
                break;
            case 7:
                result = "SEVEN";
                break;
            case 8:
                result = "EIGHT";
                break;
            case 9:
                result = "NINE";
                break;
            default:
                result = "OTHER";          
        }
        
        System.out.println(
            result
        );

        return null;
	}
    
}

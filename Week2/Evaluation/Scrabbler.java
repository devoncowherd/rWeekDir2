package Week2.Evaluation;

/**
 * 13. Scrabble Score
 * 
 * Given a word, compute the scrabble score for that word.
 * 
 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
 * "cabbage" should be scored as worth 14 points:
 * if(charArr[i] == A, E, I, O, U, L, N, R, S, T)
 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
 * point for E And to total:
 * 
 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
 */


public class Scrabbler {

    public static void main(String [] args){
        System.out.println(getScrabbleScore("Cabbage"));

    }

    public static int getScrabbleScore(String string) {
		int score = 0;
        char [] charArr = string.toUpperCase().toCharArray();
        for(int i = 0; i < charArr.length; i++){
            if(charArr[i] == 'A' ||
            charArr[i] == 'E' ||
            charArr[i] == 'I' ||
            charArr[i] ==  'O' || 
            charArr[i] == 'U' ||
            charArr[i] == 'L' || 
            charArr[i] == 'N' ||
            charArr[i] == 'R' || 
            charArr[i] == 'S' || 
            charArr[i] == 'T'){
                score++;
            } else if(charArr[i]== 'D' || charArr[i] == 'G'){
                score+=2;
            } else if(charArr[i] == 'B' || 
            charArr[i] == 'C' ||
            charArr[i] == 'M' || 
            charArr[i] == 'P'){
                score+=3;
            } else if(charArr[i] == 'F' ||
            charArr[i] == 'H' ||
            charArr[i] == 'V' || 
            charArr[i] == 'W' ||
            charArr[i] == 'Y'){
                score+=4;
            } else if(charArr[i] == 'K'){
                score+=5;
            } else if(charArr[i] == 'J' || charArr[i] == 'X'){
                score+=6;
            } else {
                score+=10;
            }
        }

        return score;
	}
}

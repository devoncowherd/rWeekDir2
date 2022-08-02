package Week2.Evaluation;

/**
 * 10. Reverse String
 * 
 * Without using the StringBuilder or StringBuffer class, write a method that
 * reverses a String. Example: reverse("example"); -> "elpmaxe"
 */


public class Reverser {

    public static void main(String [] args){

        System.out.println(reverse("example"));
    }
    

    public static String reverse(String string) {
		//char array 
        char [] arr  = string.toCharArray();
        char [] reverse = new char[arr.length];
        int count = 0;

        for(int i = string.length() - 1; i >= 0; i--){
            reverse[count] = arr[i];
            count++;
        }
		return String.valueOf(reverse);
	}

}

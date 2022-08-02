package Week2.Evaluation;
import java.util.HashMap;
import java.util.Map;

/**
 * 15. Recurring Word Counter
 * 
 * Given a phrase, count the occurrences of each word in that phrase.
 * 
 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
 * free: 1
 */

 //TODOOOOOOOOO
public class WordInstance {

    public static void main(String[] args){
        System.out.println(wordCount("olly olly in come free"));
    }

	public static Map<String, Integer> wordCount(String string) {
        
        //hashmap
        Map<String, Integer> hashMap = new HashMap<>();

        //create an array
        String [] words = string.split(" ");

        for (String word : words){
            Integer num = hashMap.get(word);
            if(num == null){
                hashMap.put(word,1);
            } else {
                hashMap.put(word, num + 1);
            }
        }

        return hashMap;
	}
    
}

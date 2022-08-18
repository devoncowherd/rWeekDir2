import java.util.*;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.remove("three");
        set.add("new");
        set.add("...found empty slot");
        set.add("...found empty slot again");
        set.add("...found empty slot once more");


        System.out.println(set);


    }
}

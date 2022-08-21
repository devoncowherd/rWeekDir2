import java.util.stream.*;
import java.util.ArrayList;

public class StreamExample1 {
    public static void main(String [] args){

        Stream<String> testStream = Stream.empty();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int x = 0; x<11; x++){
            arrayList.add(x);
        }

        System.out.println("...Printing all numbers...");
        arrayList.stream().forEach(x -> System.out.println(x));
        
        System.out.println("...Printing all even numbers");
        arrayList.stream().filter(x-> x % 2 == 0).forEach(x -> System.out.println(x));

        System.out.println("...Doubling each");
        arrayList.stream().map(x -> x = x * 2).forEach(x-> System.out.println(x));
    }
}
import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args){
        ArrayList<String> coworkers = new ArrayList<>();
        coworkers.add("Devon");
        coworkers.add("Kurt");
        coworkers.add("Elmer");

        for(String worker : coworkers){
            System.out.println(worker);
        }
    }
}

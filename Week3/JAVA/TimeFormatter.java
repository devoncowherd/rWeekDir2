import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    //split by colon
    String [] arr = splitByColon(s);
    //check for am/pm
    if(isNight(s)){
        return removeAmPm(
            getNightTime(arr[0], arr[1], arr[0])
            );
    }
    //concatenate time back together
    //add leading zeroes for <10
    //Remove trailing AM/PM

    return "";
    }

}

public static String [] splitByColon(String s){
    return s.split(":");
}


public static boolean isNight(String s) {
    if(s.contains("PM")) {
        return true;
    }
    return false;
}

public static String getNightTime(String hours, String minutes, String seconds) {
    if(hours == "12") {
        return hours + ":" + minutes + ":" + seconds;
    } 
    return Integer.parseInt(hours) - 12 + ":" + minutes + ":" + seconds;
}

public static String removeAmPm(String s){
    return s.split("PA")[0];
}

public class TimeFormatter {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        //String s = bufferedReader.readLine();
        String s = "12:01:00";
        String result = Result.timeConversion(s);

        // bufferedWriter.write(result);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
        System.out.println(result);
    }
    
}


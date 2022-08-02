package Week2.Evaluation;

/**
 * 2. MegaBytes and KiloBytes
 * 
 * Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type
 * int with the name kiloBytes.
 * 
 * The method should return a String and it needs to calculate the megabytes and
 * remaining kilobytes from the kilobytes parameter.
 * 
 * Then it needs to print a message in the format "XX KB = YY MB and ZZ KB".
 * 
 * XX represents the original value kiloBytes. YY represents the calculated
 * megabytes. ZZ represents the calculated remaining kilobytes.
 * 
 * For examples, when the parameter kiloBytes is 2500 it needs to print "2500 KB
 * = 2 MB and 452 KB"
 * 
 * If the parameter kiloBytes is less than 0 then print the text "Invalid
 * Value".
 */

import java.io.*;
import java.util.Arrays;
import java.text.NumberFormat;

public class MegaKilo {


    public static void main(String [] args) {

        System.out.println(printMegaBytesAndKiloBytes(-1466));
    }

    public static String printMegaBytesAndKiloBytes(int kiloBytes) {

        //Formatter
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMinimumFractionDigits(3);
        nf.setMaximumFractionDigits(3);

        //convert to string
        String kilo = String.valueOf(kiloBytes * 0.001);

        //separate variables
        String megaBytes = "0";
        String remainingKB = String.valueOf(kiloBytes);

        //split mega and kilo
        if(kiloBytes >= 1000){
            megaBytes = kilo.split("\\.")[0];
            remainingKB = kilo.split("\\.")[1];
        } 

        //removing leading zeroes
        if(remainingKB.split("")[0].equals("0")){
            remainingKB = remainingKB.substring(1,remainingKB.length());
            if(remainingKB.split("")[0].equals("0")){
                remainingKB = remainingKB.substring(1,remainingKB.length());
                
            }         
        }
        

        //return result
        if(kiloBytes >= 0 ) {
            return kiloBytes + " KB = " + megaBytes + " MB " + remainingKB + " KB";
        }
        
        return "Invalid Value";
    }
    
}

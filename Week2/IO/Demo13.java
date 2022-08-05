package Week2.IO;

import java.io.File;

public class Demo13 {

    public static void main(String [] args){
            File file = new File("data.txt");
            System.out.println(file.exists());

            // try {
            //     file.createNewFile();
            // } catch(IOException e) {
            //     e.printSTackTrace();
            // }


    }
}

package Week2.IO;

import java.io.*;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;

public class Demo14 {
    public static void main(String [] args){

        //Declaring directory
        File file = new File("db.txt");
        //Checking if the file exists
        if(file.exists()){
            System.out.println("The file exists");
        } else {
            System.out.println("The file doesn't exist");
        }
        //tries to create a file if it doesn't exist
        try{
            file.createNewFile();
        } catch(IOException e){
            System.out.println("That file already exists");
            e.printStackTrace();
        }


        //creates a directory on specified path
        File dir = new File("Week2/IO/generated");
        if(!dir.exists()){
            dir.mkdirs();
        }

        //pangram to store in the files                    
        String pangram = "The quick brown fox jumps over the lazy dog";
        String [] pangramArr = pangram.split(" "); 
        System.out.println(Arrays.toString(pangramArr));

        if(dir.exists()){

            for(int i = 0; i < pangramArr.length; i++){
                File temp = new File(dir,"temp" + i + ".txt");
                try{
                    temp.createNewFile();
                } catch(IOException e){
                    e.printStackTrace();
                }
            }

            //array that can hold files
            File [] subdirFiles;
            List<File> list = new LinkedList<File>();

            FileWriter fw;
            int count = 0;
            //Manipulating the files
            if(dir.exists()){
                subdirFiles = dir.listFiles();
                if(subdirFiles != null){
                    for(File item : subdirFiles){
                        if(item.isFile()){
                            //Prepping to write to a file
                            try{
                                fw = new FileWriter(item);
                                //Writes to the file as long as there's more Pangram
                                try{
                                    fw.write(pangramArr[count]);
                                    fw.close();
                                } catch(IOException e){
                                    e.printStackTrace();
                                }
                                

                            }catch(IOException e){
                                e.printStackTrace();
                            }
                            //adds the file to a list

                            list.add(item);
                            count++;
                        }
                        
                    }
                }
            }

            //show the file list
            System.out.println("File List: " + list);
        } 



    }
    
}

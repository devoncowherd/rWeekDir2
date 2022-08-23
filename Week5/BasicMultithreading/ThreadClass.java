package Week5.BasicMultithreading;

//You may use this over Runnable if you want
//the built-in methods
class MultipleThread extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("Thread " + 
            Thread.currentThread().getId() + 
            " is running");
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class ThreadClass{
    public static void main(String [] args){
        for(int i = 0; i < 9; i++){
            MultipleThread multiThread = new MultipleThread();
            //The output demonstrates how this same object can be
            //shares among multiple threads
            multiThread.start();
        }
    }
}


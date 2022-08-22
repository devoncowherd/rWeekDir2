package Week5.BasicMultithreading;

//This is preferrable to extending Thread because it can extend 
//another class

class Test implements Runnable{
    public void run(){
        try{
            System.out.println("Here's the current thread: " + Thread.currentThread().getId());
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

public class RunnableClass {
    public static void main(String [] args){
        for(int i = 0; i < 10; i++){
            Thread thread = new Thread(new Test());
            thread.start();
        }
    }
    
}

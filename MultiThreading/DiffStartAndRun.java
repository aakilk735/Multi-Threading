package MultiThreading;

public class DiffStartAndRun extends Thread{
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is Running");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }


    }

    public static void main(String[] args) {
        DiffStartAndRun t=new DiffStartAndRun();
        for(int i=1;i<=5;i++){
            t.run();
            // we get same ids for all threads because we have directly() called run().
        }
    }

}

package MultiThreading;

public class DaemonThread extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread Running...");
        }
        else{
            System.out.println("User Thread Running...");
        }
    }

    public static void main(String[] args) {
        DaemonThread d1=new DaemonThread();
        DaemonThread d2=new DaemonThread();
        d1.setDaemon(true);
        d1.start();
        d2.start();
    }
}

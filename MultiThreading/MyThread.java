package MultiThreading;

import javax.swing.plaf.TableHeaderUI;

public class MyThread implements Runnable{
    public void run(){
        // task for Thread

        for(int i=1;i<=5;i++){
            System.out.println("Value of i="+i);
            try {
                Thread.sleep(2000);
            }catch (Exception e){

            }
        }
    }

    public static void main(String[] args) {
        // create object for MyThread class
        MyThread t1=new MyThread();
        Thread thread=new Thread(t1);
        thread.start();
    }
}

package MultiThreading;

public class MyAnotherThread extends Thread{

        public void run(){
            for(int i=5;i>=1;i--){
                System.out.println("Reverse value of i="+i);
                try {
                    Thread.sleep(2000);
                }catch (Exception e){

                }
            }
        }

    public static void main(String[] args) {
       MyAnotherThread t2=new MyAnotherThread();
       t2.start();
    }
}

package MultiThreading;

class Bank extends Thread{
   static int balance=5000;
    static int withdrow;
    Bank(int withdrow){
        this.withdrow=withdrow;
    }
    // This code is syschronized not for multiple thread(multiple locking)
   /* public synchronized void run(){
        String name=Thread.currentThread().getName();
        if(withdrow<=balance){
            System.out.println(name+" withdrown Money");
            balance=balance-withdrow;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
*/
    public  static synchronized void WithrowMethoh(){
        String name=Thread.currentThread().getName();
        if(withdrow<=balance){
            System.out.println(name+" withdrown Money");
            balance=balance-withdrow;
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }
    public void run(){
        WithrowMethoh();
    }

}
public class RealLifeExampleSynchronization {
    public static void main(String[] args) {
        Bank obj=new Bank(5000);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        Bank obj1=new Bank(5000);
        Thread t3=new Thread(obj1);
        Thread t4=new Thread(obj1);

        t1.setName("Aakil");
        t2.setName("Aman");
        t3.setName("Anish");
        t4.setName("sofis");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

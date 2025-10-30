package MultiThreading;

class show {
    public void Print(String s) {

        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("How are you " + s);
            }
        }
    }
}
class Thread5 extends Thread{
    show st;
    String s;
    Thread5(show st,String s){
        this.st=st;
        this.s=s;
    }
    public void run(){
        st.Print(s);
    }
}
class Thread6 extends Thread{
    show st;
    String s;
    Thread6(show st,String s){
        this.st=st;
        this.s=s;
    }
    public void run(){
        st.Print(s);
    }
}
public class SynchronizationWithBlock {
    public static void main(String[] args) {
        show obj=new show();
        Thread5 t1=new Thread5(obj,"Mohammad Aakil");
        Thread6 t2=new Thread6(obj,"Aman khan");

        t1.start();
        t2.start();
    }
}

package MultiThreading;

public class ThreadOperations {
    public static void main(String[] args) {
        System.out.println("Program started...");
        int x=10+15;
        System.out.println("Sum is="+x);
        // Thread...
        Thread t=Thread.currentThread();
        String tname=t.getName();
        System.out.println("Current running thread is :"+tname);
        t.setName("User Thread");
        String Newname=t.getName();
        System.out.println(Newname);
        try{
            Thread.sleep(2000);
        }catch (Exception e){

        }
        System.out.println(t.getId());

        System.out.println("Program ended...");
    }
}

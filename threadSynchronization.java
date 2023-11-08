class thread1 implements Runnable{
    public synchronized void run(){
        int sum=0;
        for(int i=0;i<5;i++){
            sum=sum+5;
            System.out.println(sum);
        }
      try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e);
        }
      }
}
public class threadSynchronization{
    public static void main(String [] args) throws InterruptedException{
        thread1 obj=new thread1();
        Thread t1=new Thread(obj);
        t1.start();
        t1.join();
        System.out.println(100);
    }
}

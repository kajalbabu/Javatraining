
public class threadVolatile implements Runnable{
       public static volatile int n=0;

    public void run(){
      
        while (n==0) {
            System.out.println("it is running");
            
        }
    }
    public static void main(String[] args)throws InterruptedException {
        threadVolatile obj = new threadVolatile();
        Thread t1 = new Thread(obj);
        t1.start();
        Thread.sleep(100);
        n =10;
        System.out.println("Now it is printing");
    }
}

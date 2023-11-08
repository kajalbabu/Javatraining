class A implements Runnable{
    int count=0;
    public synchronized void increment(){
        count++;
    }
    public  void run(){
                for(int i=0;i<1000;i++){
                    increment();
                }
            }
}
public class threadSynchronization {
    public static void main(String[] args) throws Exception{
        A obj=new A();
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count="+obj.count);
    }
}

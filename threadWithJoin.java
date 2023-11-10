class A extends Thread {
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("It is first thread");
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("It is interrupted");
        }
    }
}

public class threadWithJoin {
    public static void main(String[] args) throws InterruptedException {
        A t1 = new A();
        t1.start();
        t1.interrupt();
        t1.join();

        System.out.println("It is the main program");
    }
}

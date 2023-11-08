import java.util.Scanner;

class A implements Runnable{
    public void run(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 1st string:");
    String str1=sc.nextLine();
    for(int i=0;i<5;i++){
        System.out.println(str1);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Exception happened");
        }
        
    }
}
}
class B implements Runnable{
    public void run(){
    Scanner sc2 = new Scanner(System.in);
    System.out.println("Enter 2nd string:");
    String str2=sc2.nextLine();
    for(int i=0;i<5;i++){
        System.out.println(str2);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
           System.out.println("Exception happened");
        }
        
    }
}
}


public class thread {
    public static void main(String [] args){
        A obj1=new A();
        B obj2=new B();
        Thread thread=new Thread(obj1);
        Thread thread2=new Thread(obj2);
        thread.start();
        thread2.start();
       

    }
}

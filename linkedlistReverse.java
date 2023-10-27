import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class linkedlistReverse {
    public static void main(String[] args){
        int integerElements,limit;
    
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        while (run) {
            System.out.println("1. Integer Array using reverse function");
            System.out.println("2. Integer Array without using reverse function"); 
            int choice=scanner.nextInt();
            switch (choice) {
            case 1:

                    //using reverse function

                    LinkedList<Integer> Reverse=new LinkedList<>();
                    LinkedList<Integer> newReverse=new LinkedList<>();
                    System.out.println("Enter the limit for integer array: ");
                    limit=scanner.nextInt();
                    System.out.println("Enter the elements for integer array using reverse function: ");
                    for(int i=0;i<limit;i++){
                    integerElements=scanner.nextInt();
                    Reverse.add(integerElements);
                    }
                    System.out.println("Before reversing: "+Reverse);
                    Collections.reverse(Reverse);
                    System.out.println("After reversing: "+Reverse);
                    break;
            case 2:

                    //Without using reverse function

                    LinkedList<Integer> noReverse=new LinkedList<>();
                    LinkedList<Integer> newnoReverse=new LinkedList<>();
                    System.out.println("Enter the limit for integer array: ");
                    limit=scanner.nextInt();
                    System.out.println("Enter the elements for integer array without using reverse function: ");
                    for(int i=0;i<limit;i++){
                    integerElements=scanner.nextInt();
                    noReverse.add(integerElements);
                    }
                    System.out.println("Before reversing: "+noReverse);
       
                    for(Integer element:noReverse)
                    {
                        newnoReverse.addFirst(element); 
                    }
                    System.out.println("After reversing: "+newnoReverse);
                    break;
            default:
                    run=false;
                    break;
            }
        }
    }
}

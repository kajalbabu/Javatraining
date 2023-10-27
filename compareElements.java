import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class compareElements {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        boolean run=true;
        while (run) {
            System.out.println("1. Integer Array");
            System.out.println("2. String Array");   
            System.out.println("Enter the choice: ");
            int choice=scanner.nextInt();
            switch (choice) {
                case 1:
                    //Integer Array

                        int limit,integerElements;
                        List<Integer> CompareintegerElements=new ArrayList<>();
        
                         System.out.println("Enter the limit for array: ");
                         limit=scanner.nextInt();
                         System.out.println("Enter the elements for integer array: ");
                         for(int i=0;i<limit;i++){
                         integerElements=scanner.nextInt();
                         CompareintegerElements.add(integerElements);
                         }
                         System.out.println(CompareintegerElements);
                         int intMinimum=Collections.min(CompareintegerElements);
                         int intMaximum=Collections.max(CompareintegerElements);
                         if(intMinimum==intMaximum){
                         System.out.println("All elements are equal...");
                        }
                         else{
                             System.out.println("Minimum value of our list is: "+intMinimum);
                             System.out.println("Maximum value of our list is: "+intMaximum);
                             }
                         break;
                case 2:

                      //String Array
                              String stringElements;
                              List<String> ComparestringElements=new ArrayList<>();
                              Scanner scanner2=new Scanner(System.in);
                              System.out.println("Enter the limit for array: ");
                              limit=scanner.nextInt();
                              System.out.println("Enter the elements for string array: ");
                              for(int i=0;i<limit;i++){
                                  stringElements=scanner2.nextLine();
                                  ComparestringElements.add(stringElements);
                                 }
                              System.out.println(ComparestringElements);
                              String strMinimum=Collections.min(ComparestringElements);
                              String strMaximum=Collections.max(ComparestringElements);
                              if(strMinimum==strMaximum){
                                   System.out.println("All elements are equal...");
                              }
                              else{
                                   System.out.println("Minimum value of our list is: "+strMinimum);
                                   System.out.println("Maximum value of our list is: "+strMaximum);
                              }

                             break;
            
                default:
                    run=false;
                    break;
            }
        




      
}
    }
    }


import java.util.Scanner;
import java.util.Arrays;

public class sort {
    public static void main(String[] args){
        int n;
        Scanner scanner=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Enter the array limit:");
        n=scanner.nextInt();
        int[] array=new int[n];
        String[] array1=new String[n];
        System.out.println("Enter the elements for numeric array:");
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Enter the elements for string array:");
        for(int i=0;i<n;i++){
            array1[i]=scanner2.nextLine();
        }
        System.out.println("Original numeric array:");
        for(int no:array){
            System.out.println(no);
        }
        Arrays.sort(array);
        System.out.println("Sorted numeric array:");
        for(int no:array){
            System.out.println(no);
        }
        System.out.println("Original string array:");
        for(String no:array1){
            System.out.println(no);
        }
        Arrays.sort(array1);
        System.out.println("Sorted string array:");
        for(String no:array1){
            System.out.println(no);
        }
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class average {
    public static void main(String[] args){
        int l,sum=0;
        double avg;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array limit: ");
        l=scanner.nextInt();
        int[] array=new int[l];
        System.out.println("Enter the array elements:");
        for(int i=0;i<l;i++){
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<l;i++){
            sum=sum+array[i];
        }
        System.out.println("Sum is: "+sum);
        avg=sum/l;
        System.out.println("Average is:"+avg);
    }
}

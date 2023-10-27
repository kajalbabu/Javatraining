import java.util.Scanner;

public class rotation {
    public static void main(String[] args){
        int rotate,limit,temp=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the array limit: ");
        limit=scanner.nextInt();
        System.out.println("Enter the number of times to rotate:");
        rotate=scanner.nextInt();
        int[] numericArray=new int[limit];
        System.out.println("Enter the array:");
        for(int i=0;i<limit;i++)
        {
            numericArray[i]=scanner.nextInt();
        }
        
        for(int j=0;j<=rotate;j++)
        {
            int t=0;
            temp=numericArray[t];
        for(int i=0;i<limit-1;i++)
        {
            numericArray[i]=numericArray[i+1];
        }
        numericArray[limit-1]=temp;
       // System.out.println("hi");
    }
    System.out.println("Rotated array is: ");
    for(int array:numericArray)
    {
        System.out.println(array);
    }
    }
}

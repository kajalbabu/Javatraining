import java.util.Scanner;
import java.util.Arrays;

public class average {
    public static void main(String[] args) {
        int l, sum = 0;
        double avg;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the array limit: ");
        l = scanner.nextInt();
        int[] array = new int[l];
        System.out.println("Enter the array elements:");
        try {
            for (int i = 0; i < l; i++) {
                array[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bound");
        } finally {
            System.out.println("Array elements are: ");
            for (int m : array) {
                System.out.println(m);
            }
        }
        for (int i = 0; i < l; i++) {
            sum = sum + array[i];
        }
        System.out.println("Sum is: " + sum);
        avg = sum / l;
        System.out.println("Average is:" + avg);
    }
}

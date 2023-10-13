import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a limit:");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                count = count + i;
            }
        }
        System.out.println("The sum = " + count);
    }
}

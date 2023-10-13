import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int flag = 0;
        int i = 2;
        if (i < num) {
            if (num % i == 0) {
                flag = 1;
            } else {
                i++;
            }
        }
        if (flag == 0 && num > 1) {
            System.out.println("The number " + num + " is prime");
        } else {
            System.out.println("The number " + num + " is not a prime");
        }
    }
}

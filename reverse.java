import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        int rev = 0, remainder;
        for (; num != 0;) {
            remainder = num % 10;
            rev = rev * 10 + remainder;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rev);
    }
}
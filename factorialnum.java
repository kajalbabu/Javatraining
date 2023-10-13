import java.util.Scanner;

public class factorialnum {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter a number:");
                int num = scanner.nextInt();
                int fact;
                fact = factorial(num);
                System.out.println("Factorial of " + num + " = " + fact);
        }

        public static int factorial(int n) {
                if (n == 0) {
                        return 1;
                } else {
                        return (n * factorial(n - 1));
                }
        }
}

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if(n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = calculateFactorial(n);
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }

    public static long calculateFactorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            long result = 1;
            for(int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        }
    }
}

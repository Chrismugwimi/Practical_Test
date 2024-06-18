//2. Write a recursive function to calculate the factorial of a number
import java.util.Scanner;

public class RecFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.println("Please enter a non negative integer");
        } else {
            long result = factorial(number);
            System.out.printf("Factorial of %d is %d%n", number, result);
        }
    }
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

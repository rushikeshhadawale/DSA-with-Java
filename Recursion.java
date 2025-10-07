import java.util.Scanner;

public class Recursion {

    // Recursive function to calculate factorial
    static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case
        } else {
            return n * factorial(n - 1); // Recursive step
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // Calculate factorial and display
        int result = factorial(n);
        System.out.println("Factorial = " + result);

        sc.close();
    }
}

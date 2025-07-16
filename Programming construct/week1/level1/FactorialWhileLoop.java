import java.util.Scanner;

public class FactorialWhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();

        // Check if the input is a positive integer
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Compute factorial using while loop
            long factorial = 1; // Using long to handle large values
            int i = 1;
            
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Display result
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        scanner.close();
    }
}

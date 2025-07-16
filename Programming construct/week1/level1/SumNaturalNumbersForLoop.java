import java.util.Scanner;

public class SumNaturalNumbersForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a natural number (positive integer): ");
        int n = scanner.nextInt();

        // Check if the input is a natural number (n > 0)
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number.");
        } else {
            // Compute sum using formula
            int formulaSum = n * (n + 1) / 2;

            // Compute sum using for loop
            int forLoopSum = 0;
            for (int i = 1; i <= n; i++) {
                forLoopSum += i;
            }

            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using for loop: " + forLoopSum);

            // Verify correctness
            if (formulaSum == forLoopSum) {
                System.out.println("Both computations match! ✅");
            } else {
                System.out.println("Mismatch in computations ❌");
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class SumNaturalNumbers {
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

            // Compute sum using while loop
            int whileSum = 0, i = 1;
            while (i <= n) {
                whileSum += i;
                i++;
            }

            // Display results
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + whileSum);

            // Verify correctness
            if (formulaSum == whileSum) {
                System.out.println("Both computations match! ✅");
            } else {
                System.out.println("Mismatch in computations ❌");
            }
        }

        scanner.close();
    }
}

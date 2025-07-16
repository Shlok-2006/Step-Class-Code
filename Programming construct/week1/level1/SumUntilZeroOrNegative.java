import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Variable to store the sum

        // Infinite loop
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = scanner.nextDouble();

            // Break condition: if the user enters 0 or a negative number
            if (number <= 0) {
                break;
            }

            total += number; // Add number to total
        }

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

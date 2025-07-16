import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double total = 0.0; // Variable to store the sum
        double number; // Variable to store user input

        // Loop until user enters 0
        do {
            System.out.print("Enter a number (0 to stop): ");
            number = scanner.nextDouble();
            total += number; // Add number to total
        } while (number != 0); // Continue until 0 is entered

        // Display the total sum
        System.out.println("The total sum is: " + total);

        scanner.close();
    }
}

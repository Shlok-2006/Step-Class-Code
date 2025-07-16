import java.util.Scanner;

public class RocketLaunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input countdown start value from the user
        System.out.print("Enter the countdown start number: ");
        int counter = scanner.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // Decrement counter
        }

        // Rocket launch message
        System.out.println("Lift off!");

        scanner.close();
    }
}

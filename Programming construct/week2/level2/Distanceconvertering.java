import java.util.Scanner;

public class Distanceconvertering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.printf("The distance is %.2f yards and %.2f miles for the input of %.2f feet.\n", 
                          distanceInYards, distanceInMiles, distanceInFeet);
        scanner.close();
    }
}

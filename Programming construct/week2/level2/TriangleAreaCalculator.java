import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = scanner.nextDouble();
        double areaInInches = 0.5 * base * height;
        double areaInCm = areaInInches * 6.4516;
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;
        double remainingInches = height % 12;
        System.out.println("\nThe area of the triangle is:");
        System.out.printf(" - %.2f square inches\n", areaInInches);
        System.out.printf(" - %.2f square centimeters\n", areaInCm);

        System.out.println("\nYour height is:");
        System.out.printf(" - %.2f cm\n", heightInCm);
        System.out.printf(" - %.2f feet and %.2f inches\n", Math.floor(heightInFeet), remainingInches);
        scanner.close();
    }
}

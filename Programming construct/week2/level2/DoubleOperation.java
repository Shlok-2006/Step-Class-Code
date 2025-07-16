import java.util.Scanner;

public class DoubleOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();
        double result1 = a + b * c; 
        double result2 = a * b + c; 
        double result3 = c + a / b;
        double result4 = a % b + c; 
        System.out.println("The results of Double Operations are:");
        System.out.printf("1. a + b * c = %.2f\n", result1);
        System.out.printf("2. a * b + c = %.2f\n", result2);
        System.out.printf("3. c + a / b = %.2f\n", result3);
        System.out.printf("4. a %% b + c = %.2f\n", result4);
        scanner.close();
    }
}

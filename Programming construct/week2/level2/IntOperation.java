import java.util.Scanner;

public class IntOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        System.out.print("Enter the value of c: ");
        int c = scanner.nextInt();
        int result1 = a + b * c;
        int result2 = a * b + c; 
        int result3 = c + a / b; 
        int result4 = a % b + c; 
        System.out.println("The results of Int Operations are:");
        System.out.printf("1. a + b * c = %d\n", result1);
        System.out.printf("2. a * b + c = %d\n", result2);
        System.out.printf("3. c + a / b = %d\n", result3);
        System.out.printf("4. a %% b + c = %d\n", result4);
        scanner.close();
    }
}

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = divide(numerator, denominator);

            // Print the result
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            // Handle any other exceptions
            System.out.println("Error: Invalid input.");
        } finally {
            scanner.close();
        }
    }

    // Method to perform division
    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}

package GuviJavaCollections;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int denominator = scanner.nextInt();

            if (denominator == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}


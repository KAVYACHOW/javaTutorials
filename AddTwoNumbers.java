import java.util.Scanner;

public class AddTwoNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        // Read the first number
        double num1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        // Read the second number
        double num2 = scanner.nextDouble();
        System.out.print("Enter the Third number: ");
        // Read the second number
        double num3 = scanner.nextDouble();

        // Calculate the sum of the two numbers
        double sum = num1+ num2+num3;

        // Print the result
        System.out.println("The sum of 3 numbers" + sum);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}

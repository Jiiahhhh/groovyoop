package exercise.exercise1;

import java.util.Scanner;

public class simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";

        while (!userInput.equals("q")) {
            System.out.println("\n=== SIMPLE CALCULATOR ===");
            System.out.println("Type 'q' to exit");

            System.out.print("Enter first number (or 'q' to quit): ");
            userInput = scanner.next();
            if (userInput.equals("q")) {
                break;
            }

            int firstNumber = Integer.parseInt(userInput);

            System.out.print("Enter second number: ");
            int secondNumber = scanner.nextInt();

            System.out.println("1. Addition (+).");
            System.out.println("2. Subtraction (-).");
            System.out.println("3. Multiplication (*).");
            System.out.println("4. Division (/).");

            System.out.print("Enter operation number: ");
            int operationNumber = scanner.nextInt();
            int result = 0;

            // Logika operasi
            if (operationNumber == 1) {
                result = firstNumber + secondNumber;
            } else if (operationNumber == 2) {
                result = firstNumber - secondNumber;
            } else if (operationNumber == 3) {
                result = firstNumber * secondNumber;
            } else if (operationNumber == 4) {
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Cannot divide by zero!");
                    continue;
                }
            } else {
                System.out.println("Invalid operation number");
                continue;
            }
            System.out.printf("The result is %d\n", result);
        }

        System.out.println("Calculator closed.");
        scanner.close();
    }
}
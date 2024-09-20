package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Calculator {
    private Map<String, Operation> operations = new HashMap<>();

    public Calculator() {
        operations.put("add", new Addition());
        operations.put("subtract", new Subtraction());
        operations.put("multiply", new Multiplication());
        operations.put("divide", new Division());
    }

    public void performCalculation(String operationKey1, String operationKey2, double num1, double num2, double num3) {
        Operation operation1 = operations.get(operationKey1.toLowerCase());
        Operation operation2 = operations.get(operationKey2.toLowerCase());

        if (operation1 == null || operation2 == null) {
            System.out.println("Invalid operation!");
            return;
        }

        try {
            double intermediateResult = operation1.calculate(num1, num2, 0);
            double finalResult = operation2.calculate(intermediateResult, num3, 0);
            System.out.println("Result: " + finalResult);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        scanner.nextLine(); // Scannerbug

        System.out.print("Enter first operation (add, subtract, multiply, divide): ");
        String operation1 = scanner.nextLine();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        scanner.nextLine(); // Scannerbug

        System.out.print("Enter second operation (add, subtract, multiply, divide): ");
        String operation2 = scanner.nextLine();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        calculator.performCalculation(operation1, operation2, num1, num2, num3);
    }
}
package com.example.project;

import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the model of the calculator:\n> ");
        String calcModel = scanner.nextLine();
        Calculator calculator = new Calculator(calcModel);

        int menuOption = -1;
        while (menuOption != 0) {
            System.out.println(calcModel);
            System.out.println(" [1] Perform basic operation");
            System.out.println(" [2] Check divisiblity");
            System.out.println(" [3] Print coordinate pair");
            System.out.println(" [4] Get absolute value of difference");
            System.out.println(" [5] Get calculator information");
            System.out.println(" [0] Exit");
            System.out.print("\nEnter a number:\n> ");
            menuOption = scanner.nextInt();
            scanner.nextLine();

            if (menuOption == 1) {
                System.out.print("Enter the first integer: ");
                int int1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int int2 = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter the operation symbol (+, -, *, /):\n> ");
                String operation = scanner.nextLine();
                double result = calculator.performOperation(operation, int1, int2);
                System.out.println("Result of " + int1 + " " + operation + " " + int2 + ": " + result);
            } else if (menuOption == 2) {
                System.out.print("Enter the dividend: ");
                int div1 = scanner.nextInt();
                System.out.print("Enter the divisor: ");
                int div2 = scanner.nextInt();
                scanner.nextLine();
                boolean isDivisible = calculator.divisibleBy(div1, div2);
                if (isDivisible) {
                    System.out.println(div1 + " is divisible by " + div2);
                } else {
                    System.out.println(div1 + " is not divisible by " + div2);
                }
            } else if (menuOption == 3) {
                System.out.print("Enter the x value: ");
                int x = scanner.nextInt();
                System.out.print("\nEnter the y value: ");
                int y = scanner.nextInt();
                System.out.println(calculator.coordinatePair(x, y));
            } else if (menuOption == 4) {
                System.out.print("Enter the first integer: ");
                int int1 = scanner.nextInt();
                System.out.print("Enter the second integer: ");
                int int2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("The result is " + calculator.absoluteValue(int1, int2));
            } else if (menuOption == 5) {
                System.out.println(calculator.info());
            } else {
                continue;
            }
            System.out.print("Press enter to continue");
            scanner.nextLine();
        }
    }
}
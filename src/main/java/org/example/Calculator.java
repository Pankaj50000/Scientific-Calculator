package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator Application!");
        System.out.println("Please select the operation you want to perform:");
        System.out.println("1. Square Root");
        System.out.println("2. Factorial");
        System.out.println("3. Natural Logarithm");
        System.out.println("4. Power");
        System.out.print("Enter your choice (1/2/3/4): ");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter a number: ");
                double number1 = scanner.nextDouble();
                System.out.println("Square root of " + number1 + " is: " + squareRoot(number1));
                break;
            case 2:
                System.out.print("Enter a number: ");
                int number2 = scanner.nextInt();
                System.out.println("Factorial of " + number2 + " is: " + factorial(number2));
                break;
            case 3:
                System.out.print("Enter a number: ");
                double number3 = scanner.nextDouble();
                System.out.println("Natural logarithm of " + number3 + " is: " + naturalLog(number3));
                break;
            case 4:
                System.out.print("Enter base number: ");
                double base = scanner.nextDouble();
                System.out.print("Enter exponent number: ");
                double exponent = scanner.nextDouble();
                System.out.println(base + " raised to the power " + exponent + " is: " + power(base, exponent));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }

    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    public static int factorial(int x) {
        if (x == 0) return 1;
        else return x * factorial(x - 1);
    }

    public static double naturalLog(double x) {
        return Math.log(x);
    }

    public static double power(double x, double y) {
        return Math.pow(x, y);
    }
}

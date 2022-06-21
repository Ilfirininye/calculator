package com.bodkemot.calculator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {

        System.out.println("Insert first number");
        Scanner scanner = new Scanner(System.in);
        double firstNumber = scanner.nextDouble();
        System.out.println("Insert second number");
        double secondNumber = scanner.nextDouble();

        System.out.println("Choose number of operation:");
        System.out.println("[1] + (Addition)");
        System.out.println("[2] - (Subtraction");
        System.out.println("[3] * (Multiplication)");
        System.out.println("[4] / (Division)");
        int operatorChoice = scanner.nextInt();
        switch (operatorChoice) {
            case 1 -> System.out.println(addition(firstNumber, secondNumber));
            case 2 -> System.out.println(subtraction(firstNumber, secondNumber));
            case 3 -> System.out.println(multiplication(firstNumber, secondNumber));
            case 4 -> System.out.println(division(firstNumber, secondNumber));
            default -> System.out.println("Unknown operation");
        }
    }

    private static double addition(double firstNumber, double secondNumber) {
        System.out.println(firstNumber + " + " + secondNumber + " = ");
        return firstNumber + secondNumber;
    }

    private static double subtraction(double firstNumber, double secondNumber) {
        System.out.println(firstNumber + " - " + secondNumber + " = ");
        return firstNumber - secondNumber;
    }

    private static double multiplication(double firstNumber, double secondNumber) {
        System.out.println(firstNumber + " * " + secondNumber + " = ");
        return firstNumber * secondNumber;
    }

    private static double division(double firstNumber, double secondNumber) {
        System.out.println(firstNumber + " / " + secondNumber + " = ");
        return firstNumber / secondNumber;
    }
}

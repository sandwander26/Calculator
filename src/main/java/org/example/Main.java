package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter to double type numbers:");

        Calculator calculator = new Calculator(scanner.nextDouble(), '+', scanner.nextDouble());
        System.out.println("Summary: " + calculator.makeAnAction());

        calculator.setOperator('-');
        System.out.println("Subtraction: " + calculator.makeAnAction());

        calculator.setOperator('*');
        System.out.println("Multiplication: " + calculator.makeAnAction());

        calculator.setOperator('/');
        System.out.println("Division: " + calculator.makeAnAction());
    }
}

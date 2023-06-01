package org.example;
public class Calculator {

    private double firstArgument;
    private char operator;
    private double secondArgument;

    public Calculator(double firstArgument, char operator, double secondArgument) {
        this.firstArgument = firstArgument;
        this.operator = operator;
        this.secondArgument = secondArgument;
    }

    public double makeAnAction() {
        switch (operator) {
            case '+' -> {
                return add();
            }
            case '-' -> {
                return subtract();
            }
            case '*' -> {
                return multiply();
            }
            case '/' -> {
                return divide();
            }
            default -> {
                System.out.println("Wrong operator");
                return 0;
            }
        }
    }

    private double add() {
        return this.firstArgument + this.secondArgument;
    }

    private double subtract() {
        return this.firstArgument - this.secondArgument;
    }

    private double multiply() {
        return this.firstArgument * this.secondArgument;
    }

    private double divide() {
        return this.firstArgument / this.secondArgument;
    }

    public double getFirstArgument() {
        return firstArgument;
    }

    public void setFirstArgument(double firstArgument) {
        this.firstArgument = firstArgument;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public double getSecondArgument() {
        return secondArgument;
    }

    public void setSecondArgument(double secondArgument) {
        this.secondArgument = secondArgument;
    }
}
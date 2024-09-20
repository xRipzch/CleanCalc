package src;

import src.Operation;

public class Subtraction implements Operation {
    @Override
    public double calculate(double num1, double num2, double num3) {
        return num1 - num2 - num3;
    }
}
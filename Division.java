public class Division implements Operation {
    @Override
    public double calculate(double num1, double num2, double num3) {
        if (num2 == 0 || num3 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return num1 / num2 / num3;
    }
}
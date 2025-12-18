package calculator.model;

public class MultiplyStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}

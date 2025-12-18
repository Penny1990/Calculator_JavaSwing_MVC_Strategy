package calculator.model;

public class MultiplicationStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }
}

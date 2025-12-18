package calculator.model;

public class DivisionStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}

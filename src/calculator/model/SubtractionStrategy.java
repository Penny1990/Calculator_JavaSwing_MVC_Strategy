package calculator.model;

public class SubtractionStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}

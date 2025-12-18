package calculator.model;

public class CalculatorModel {
    private IArithmeticStrategy arithmeticStrategy;

    public void setArithmeticStrategy(IArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public double calculateResult(double firstNumber, double secondNumber) {
        return arithmeticStrategy.calculate(firstNumber,secondNumber);
    }
}

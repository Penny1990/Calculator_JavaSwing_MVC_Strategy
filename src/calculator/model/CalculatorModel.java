package calculator.model;

public class CalculatorModel {
    private IArithmeticStrategy arithmeticStrategy;

    public void setArithmeticStrategy(IArithmeticStrategy arithmeticStrategy) {
        this.arithmeticStrategy = arithmeticStrategy;
    }

    public double calculateResult(double firstNumber, double secondNumber) {
        if(arithmeticStrategy instanceof DivisionStrategy && secondNumber == 0) {
            throw new ArithmeticException("ERROR: Division durch 0 ist nicht erlaubt!");
        }
        return arithmeticStrategy.calculate(firstNumber,secondNumber);
    }
}

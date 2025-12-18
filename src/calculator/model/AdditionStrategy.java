package calculator.model;

public class AdditionStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondnumber) {
        return firstNumber + secondnumber;
    }
}

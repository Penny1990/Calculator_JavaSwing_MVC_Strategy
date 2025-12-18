package calculator.model;

import javax.swing.*;

public class DivisionStrategy implements IArithmeticStrategy {
    @Override
    public double calculate(double firstNumber, double secondNumber) {
        if (secondNumber == 0) {
            JOptionPane.showMessageDialog(null,"ERROR: Division durch 0 ist nicht möglich!");
            return 0.00;
        }
        return firstNumber / secondNumber;
    }
}

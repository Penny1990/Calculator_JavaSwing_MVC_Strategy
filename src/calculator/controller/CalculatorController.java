package calculator.controller;

import calculator.model.CalculatorModel;
import calculator.view.CalculatorView;

public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
    }

    private double calculateResult() {
        double result = 0.0;
        double secondNumber;
        try {
            // TODO: die zweite Zahl aus View auslesen

            // TODO: Model auffordern mit der Zahl zu rechnen

        } catch(ArithmeticException e) {
            calculatorView.showErrorMessage(e.getMessage());
        } catch(NumberFormatException e) {
            calculatorView.showErrorMessage(e.getMessage());
        } catch(Exception e) {
            calculatorView.showErrorMessage(e.getMessage());
        }
        return result;
    }
}

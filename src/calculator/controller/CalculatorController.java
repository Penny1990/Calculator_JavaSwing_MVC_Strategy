package calculator.controller;

import calculator.model.*;
import calculator.view.CalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
    private CalculatorView calculatorView;
    private CalculatorModel calculatorModel;
    private double firstNumber;

    public CalculatorController(CalculatorView calculatorView, CalculatorModel calculatorModel) {
        this.calculatorView = calculatorView;
        this.calculatorModel = calculatorModel;
        calculatorView.setArithmeticButtonClickListener(new ArithmeticButtonClickListener());
    }

    private double calculateResult() {
        double result = 0.0;
        double secondNumber;

        try {
            secondNumber = Double.parseDouble(calculatorView.getInputFromDisplay());  // Zweite Zahl auslesen
            calculatorView.clearDisplay();  // Display leeren
            result = calculatorModel.calculateResult(firstNumber,secondNumber);  // Mit Zahl rechnen
        } catch(ArithmeticException e) {
            calculatorView.showErrorMessage(e.getMessage());
        } catch(NumberFormatException e) {
            calculatorView.showErrorMessage(e.getMessage());
        } catch(Exception e) {
            calculatorView.showErrorMessage(e.getMessage());
        }
        return result;
    }

    private class ArithmeticButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            // Aufschrift des geklickten Buttons holen
            if(event.getActionCommand().equals("=")) {  // wenn '='
                double result = calculateResult();  // -> rechne mit 'calculateResult' und speicher in 'result'
                calculatorView.writeToDisplay(String.valueOf(result));  // Ergebnis ins Display schreiben
                return;
            }

            String input = calculatorView.getInputFromDisplay();

            try {
                firstNumber = Double.parseDouble(input);
                calculatorView.clearDisplay();
            } catch(NumberFormatException e) {
                calculatorView.showErrorMessage(e.getMessage());
            }

            switch(event.getActionCommand()) {
                case "+" -> calculatorModel.setArithmeticStrategy(new AdditionStrategy());
                case "-" -> calculatorModel.setArithmeticStrategy(new SubtractionStrategy());
                case "*" -> calculatorModel.setArithmeticStrategy(new MultiplicationStrategy());
                case "/" -> calculatorModel.setArithmeticStrategy(new DivisionStrategy());

            }
        }
    }
}

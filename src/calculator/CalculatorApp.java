package calculator;

import calculator.controller.CalculatorController;
import calculator.model.AdditionStrategy;
import calculator.model.CalculatorModel;
import calculator.view.CalculatorView;

import javax.swing.*;

public class CalculatorApp {
    public static void main(String[] args) {
        /*

        SwingUtilities benutzen statt 'new View();'

        Standard Override -> veraltet!!!
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View();
            }
        });

        Lambda möglich:
        SwingUtilities.invokeLater(() -> new View());

        */

        // Methodenreferenz möglich:
        // SwingUtilities.invokeLater(CalculatorView::new);

        /*

        Beides möglich, damit Swing mit EDT (Event Dispatch Thread) startet.
        Merksatz:
        Nur eine Methode oder Konstruktor ohne Argument -> Methodenreferenz (View::new).
        Mehr Code oder mehrere Schritte ausführen -> Lambda (() -> { ... }).

         */


        // TEST MODEL
        // CalculatorModel calculatorModel = new CalculatorModel();
        // calculatorModel.setArithmeticStrategy(new AdditionStrategy());
        // System.out.println(calculatorModel.calculateResult(2,3));

        // TEST CONTROLLER
        SwingUtilities.invokeLater(() -> new CalculatorController(new CalculatorView(), new CalculatorModel()));

    }
}

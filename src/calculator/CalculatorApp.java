package calculator;

import calculator.view.View;

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
        SwingUtilities.invokeLater(View::new);

        /*

        Beides möglich, damit Swing mit EDT (Event Dispatch Thread) startet.
        Merksatz:
        Nur eine Methode oder Konstruktor ohne Argument -> Methodenreferenz (View::new).
        Mehr Code oder mehrere Schritte ausführen -> Lambda (() -> { ... }).

         */


    }
}

package calculator.view;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    private JButton[] numberButtons;
    private JButton btnAddition, btnSubtraction, btnMultiply, btnDivision, btnEquals, btnSeperator;

    public ButtonPanel() {
        setLayout(new GridLayout(4,4));
        initButtons();
        addButtonsToPanel();
    }

    private void initButtons() {
        numberButtons = new JButton[10];

        for (int i = 0; i < numberButtons.length; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].setFont(View.DEFAULT_FONT);
            numberButtons[i].setFocusable(false); // Button Hervorhebung weg nehmen

            // TODO: Alle Buttons brauchen ihren Listener
        }

        btnAddition = createButton("+");
        btnSubtraction = createButton("-");
        btnMultiply = createButton("*");
        btnDivision = createButton("/");
        btnEquals = createButton("=");
        btnSeperator = createButton(".");
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Comic Sans", Font.BOLD, 30));
        button.setFocusable(false);

        // TODO: Listener für die Buttons hinzufügen

        return button;
    }

    private void addButtonsToPanel() {
        JButton[] buttons = {
                numberButtons[7], numberButtons[8], numberButtons[9], btnDivision,
                numberButtons[4], numberButtons[5], numberButtons[6], btnMultiply,
                numberButtons[1], numberButtons[2], numberButtons[3], btnSubtraction,
                btnSeperator, numberButtons[0], btnEquals, btnAddition
        };

        for (JButton btn : buttons) {
            add(btn);
        }

        // TODO: Spezialbuttons brauchen Listener
    }
}

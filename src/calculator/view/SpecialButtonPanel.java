package calculator.view;

import javax.swing.*;
import java.awt.*;

public class SpecialButtonPanel extends JPanel {
    private DisplayPanel displayPanel;
    private JButton btnDelete, btnClear;

    public SpecialButtonPanel(DisplayPanel displayPanel) {
        this.displayPanel = displayPanel;
        setLayout(new GridLayout(1, 2, 5, 0));
        initSpecialButtons();
        setBorder(BorderFactory.createEmptyBorder(0, 30, 30, 30));
    }

    public void initSpecialButtons() {
        btnDelete = createButton("CE");
        btnClear = createButton("C");
        btnClear.addActionListener((event) -> displayPanel.clearDisplay());
        btnDelete.addActionListener((event) -> displayPanel.deleteCharacter());
        add(btnDelete);
        add(btnClear);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(CalculatorView.DEFAULT_FONT);
        button.setFocusable(false);
        CalculatorView.applyStyle(button);
        return button;
    }
}

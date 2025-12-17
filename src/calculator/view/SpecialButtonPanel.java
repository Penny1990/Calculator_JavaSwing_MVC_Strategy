package calculator.view;

import javax.swing.*;
import java.awt.*;

public class SpecialButtonPanel extends JPanel {
    private JButton btnDelete, btnClear;

    public SpecialButtonPanel() {
        setLayout(new FlowLayout());
        initSpecialButtons();
    }

    public void initSpecialButtons() {
        btnDelete = createButton("CE");
        btnClear = createButton("C");
        add(btnDelete);
        add(btnClear);
    }

    private JButton createButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Comic Sans", Font.BOLD, 30));
        button.setFocusable(false);

        // TODO: Listener für die Buttons hinzufügen

        return button;
    }
}

package calculator.view;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {
    private JTextField txtDisplay;

    public DisplayPanel() {
        initDisplayPanel();
    }

    private void initDisplayPanel() {
        txtDisplay = new JTextField();
        txtDisplay.setFont(CalculatorView.DEFAULT_FONT);
        txtDisplay.setHorizontalAlignment(JTextField.RIGHT); // rechtsbündig
        txtDisplay.setEditable(false); // Textfeld nicht editierbar

        setLayout(new BorderLayout());
        add(txtDisplay, BorderLayout.CENTER);
        setBorder(BorderFactory.createEmptyBorder(30, 30, 0, 30));

    }

    public void setDisplayText(String text) {
        this.txtDisplay.setText(text);
    }

    public String getDisplayText() {
        return txtDisplay.getText();
    }

    public void clearDisplay() {
        setDisplayText("");
    }

    public void deleteCharacter() {
        String text = getDisplayText();
        if(!text.isEmpty()) {
            setDisplayText(text.substring(0,text.length()-1));
        }
    }
}

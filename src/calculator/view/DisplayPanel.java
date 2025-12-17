package calculator.view;

import javax.swing.*;
import java.awt.*;

public class DisplayPanel extends JPanel {

    private JTextField txt_display;

    public DisplayPanel() {
        initDisplayPanel();
    }

    private void initDisplayPanel() {
        txt_display = new JTextField();
        txt_display.setFont(new Font("Comic Sans", Font.BOLD, 30));
        txt_display.setHorizontalAlignment(JTextField.RIGHT); // rechtsbündig
        txt_display.setEditable(false); // Textfeld nicht editierbar

        setLayout(new BorderLayout());
        add(txt_display, BorderLayout.CENTER);
    }

    public void setDisplayText(String text) {
        this.txt_display.setText(text);
    }

    public String getDisplayText() {
        return txt_display.getText();
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

package calculator.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CalculatorView {
    public static final Font DEFAULT_FONT = new Font("Courier New", Font.TRUETYPE_FONT, 40);
    public static void applyStyle(JButton btn) {
        btn.setBorder(BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                new Color(200, 255, 200), new Color(0, 128, 0)
        ));
        btn.setBackground(new Color(155, 217, 155));
        btn.setForeground(Color.BLACK);
        btn.setFocusPainted(false);
    }

    private JFrame mainWindow;
    private DisplayPanel displayPanel;
    private ButtonPanel buttonPanel;
    private SpecialButtonPanel specialButtonPanel;

    public CalculatorView() {
        initMainWindow();
    }

    private void initMainWindow() {
        mainWindow = new JFrame("Calculator");
        mainWindow.setSize(420,550);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new BorderLayout());
        mainWindow.setBackground(new Color(104,139,173));


        displayPanel = new DisplayPanel();
        buttonPanel = new ButtonPanel(displayPanel);
        specialButtonPanel = new SpecialButtonPanel(displayPanel);

        mainWindow.add(displayPanel,BorderLayout.NORTH);
        mainWindow.add(buttonPanel, BorderLayout.CENTER);
        mainWindow.add(specialButtonPanel, BorderLayout.SOUTH);

        mainWindow.setUndecorated(true);
        mainWindow.getRootPane().setWindowDecorationStyle(JRootPane.QUESTION_DIALOG);

        mainWindow.setVisible(true);
    }

    public void writeToDisplay(String text) {
        displayPanel.setDisplayText(text); // vom DisplayPanel
    }

    public String getInputFromDisplay() {
        return displayPanel.getDisplayText(); // vom DisplayPanel
    }

    public void clearDisplay() {
        displayPanel.clearDisplay(); // vom DisplayPanel
    }

    public void setArithmeticButtonClickListener(ActionListener listener) {
        buttonPanel.setArithmeticButtonClickListener(listener);
    }

    public void showErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(mainWindow, errorMessage);
    }


}

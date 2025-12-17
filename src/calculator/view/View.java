package calculator.view;

import javax.swing.*;
import java.awt.*;

public class View {
    public static final Font DEFAULT_FONT = new Font("Comic Sans", Font.BOLD, 30);

    private JFrame mainWindow;
    private DisplayPanel displayPanel;
    private ButtonPanel buttonPanel;
    private SpecialButtonPanel specialButtonPanel;

    public View() {
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
        buttonPanel = new ButtonPanel();
        specialButtonPanel = new SpecialButtonPanel();

        mainWindow.add(displayPanel,BorderLayout.NORTH);
        mainWindow.add(buttonPanel, BorderLayout.CENTER);
        mainWindow.add(specialButtonPanel, BorderLayout.SOUTH);

        mainWindow.setVisible(true);
    }
}

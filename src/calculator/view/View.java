package calculator.view;

import javax.swing.*;
import java.awt.*;

public class View {

    private JFrame mainWindow;

    public View() {
        initMainWindow();
    }

    private void initMainWindow() {
        mainWindow = new JFrame("Calculator");
        mainWindow.setSize(420,550);
        mainWindow.setResizable(false);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new BorderLayout());



        mainWindow.setVisible(true);

    }
}

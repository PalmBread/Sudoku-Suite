package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class Window {
    private JFrame frame = new JFrame("Sudoku Suite");
    JPanel panel = new JPanel(new CardLayout());

    public Window() {
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show(boolean value) {
        frame.setVisible(value);
    }

    public void displayPage(Page page) {
        panel.add(page.panel);
    }
}
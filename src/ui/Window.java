package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;

public class Window {
    private JFrame frame = new JFrame("Sudoku Suite");
    private CardLayout layout = new CardLayout();
    JPanel panel = new JPanel(layout);
    public int panelCount = 0;

    public Window() {
        frame.add(this.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display(boolean value) {
        frame.setVisible(value);
    }

    public void displayPage(Page page) {
        frame.setSize(page.size);
        frame.setLocationRelativeTo(null);
        layout.show(page.panel, null);
    }
}
package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.Dimension;

public class Window {
    private JFrame frame = new JFrame("Sudoku Suite");
    JPanel panel = new JPanel(new CardLayout());

    public Window() {
        frame.add(this.panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void display(boolean value) {
        frame.setVisible(value);
    }

    public void displayPage(Page page) {
        this.panel.add(page.panel);
    }

    public void setSize(Dimension size) {
        frame.setSize(size);
        frame.setLocationRelativeTo(null);
    }
}
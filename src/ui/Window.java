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
        this.frame.add(this.panel);
        this.frame.setResizable(false);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.addKeyListener(null);

        this.panel.setFocusable(true);
    }

    public void display(boolean value) {
        this.frame.setVisible(value);
        this.panel.requestFocusInWindow();
    }

    public void displayPage(Page page) {
        this.frame.setSize(page.size);
        this.frame.setLocationRelativeTo(null);
        this.layout.show(this.panel, page.index);
    }
}
package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import pages.SolverPage;

import java.awt.CardLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
        this.panel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char c = e.getKeyChar();

                if ("0123456789".indexOf(c) != -1) {
                    String value = String.valueOf(c);

                    value = value == "0" ? "" : value;

                    SolverPage.activeNumber = value;
                }
            }
        });
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
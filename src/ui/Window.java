package ui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.HashMap;
import java.awt.CardLayout;

public class Window {
    private JFrame frame = new JFrame("Sudoku Suite");
    HashMap<String, Page> Pages = new HashMap<>();
    JPanel panel = new JPanel(new CardLayout());

    public Window() {
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void show(boolean value) {
        frame.setVisible(value);
    }

    public void displayPage(String name) {
        panel.add(Pages.get(name).panel);
    }

    public void addPage(String name, Page page) {
        Pages.put(name, page);
    }
}
package pages;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import ui.Page;

public class SolverPage extends Page {
    public static String activeNumber = "";
    public static int[] Board = new int[81];

    public SolverPage(ui.Window window) {
        super(window, new Dimension(730, 590));

        JLabel title = new JLabel("Sudoku Solver");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        super.panel.add(title);

        JPanel uiPanel = new JPanel();
        super.panel.add(uiPanel);

        JPanel boardPanel = new JPanel(new GridLayout(9, 9, 5, 5));
        uiPanel.add(boardPanel);
        boardPanel.setSize(530, 530);

        for (int i = 0; i < 81; i++) {
            JButton button = new JButton();
            boardPanel.add(button);
            button.setBorderPainted(false);
            button.setFocusPainted(false);
            button.setBackground(Color.LIGHT_GRAY);
            button.setPreferredSize(new Dimension(50, 50));
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.putClientProperty("index", i);
            button.addActionListener(SolverPage::BoardListener);
        }

        JPanel _panel = new JPanel();
        uiPanel.add(_panel);
        panel.setPreferredSize(new Dimension(15, 1));
        
        JPanel keyPanel = new JPanel(new GridLayout(4, 3, 5, 5));
        uiPanel.add(keyPanel);

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            keyPanel.add(button);
            button.setPreferredSize(new Dimension(50, 50));
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(SolverPage::KeypadListener);
        }

        String[] texStrings = {"<", "-", "X"};
        for (int i = 0; i < 3; i++) {
            JButton button = new JButton(texStrings[i]);
            keyPanel.add(button);
            button.setPreferredSize(new Dimension(50, 50));
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(SolverPage::KeypadListener2);
        }
    }

    public static void BoardListener(ActionEvent e) {
        JButton button = (JButton) e.getSource();

        if (activeNumber != null) {
            button.setText(activeNumber);
            int index = (int) button.getClientProperty("index");
            Board[index] = Integer.valueOf(activeNumber);
        }
    }

    public static void KeypadListener(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        activeNumber = button.getText();
    }

    public static void KeypadListener2(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        switch (button.getText()) {
            case "<":
                main.SudokuSuite.MenuPage.display();
                break;

            case "-":
                activeNumber = "";
                break;

            case "X":
                main.SudokuSuite.SolverPage = new SolverPage(main.SudokuSuite.window);
                main.SudokuSuite.SolverPage.display();
                break;
        }
    }
}

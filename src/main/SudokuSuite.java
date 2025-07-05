package main;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import ui.*;

public class SudokuSuite {

    public static void main(String[] args) throws Exception {
        Window window = new Window();
        window.display(true);

        Page MenuPage = new Page(window, new Dimension(300, 250));

        
        MenuPage.panel.add(Box.createHorizontalStrut(50));
        JLabel title = new JLabel("Sudoku Suite");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        MenuPage.panel.add(title);
        MenuPage.panel.add(Box.createHorizontalStrut(50));

        MenuPage.panel.add(Box.createVerticalStrut(75));
        
        JButton solverButton = new JButton("Solver");
        solverButton.setPreferredSize(new Dimension(100, 90));
        MenuPage.panel.add(solverButton);
        
        JButton generatorButton = new JButton("Generator");
        generatorButton.setPreferredSize(new Dimension(100, 90));
        MenuPage.panel.add(generatorButton);

        MenuPage.display();
    }
}
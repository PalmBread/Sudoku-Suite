package main;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import ui.*;

public class SudokuSuite {
    public static Page GeneratorPage;
    public static Page SolverPage;
    public static Page MenuPage;

    public static void main(String[] args) throws Exception {
        Window window = new Window();
        window.display(true);

        MenuPage = new Page(window, new Dimension(300, 250));
        SolverPage = new Page(window, new Dimension(500, 500));
        GeneratorPage = new Page(window, new Dimension(600, 500));
        
        //MenuPage
        MenuPage.panel.add(Box.createHorizontalStrut(50));
        JLabel title = new JLabel("Sudoku Suite");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        MenuPage.panel.add(title);
        MenuPage.panel.add(Box.createHorizontalStrut(50));

        MenuPage.panel.add(Box.createVerticalStrut(75));
        
        JButton solverButton = new JButton("Solver");
        solverButton.setPreferredSize(new Dimension(100, 90));
        solverButton.addActionListener(_ -> { SolverPage.display(); });
        MenuPage.panel.add(solverButton);
        
        JButton generatorButton = new JButton("Generator");
        generatorButton.setPreferredSize(new Dimension(100, 90));
        generatorButton.addActionListener(_ -> { GeneratorPage.display(); });
        MenuPage.panel.add(generatorButton);
        
        MenuPage.display();
    }
}
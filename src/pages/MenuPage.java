package pages;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import ui.Page;

public class MenuPage extends Page {
    public MenuPage(ui.Window window) {
        super(window, new Dimension(300, 250));

        this.panel.add(Box.createHorizontalStrut(50));
        JLabel title = new JLabel("Sudoku Suite");
        title.setFont(new Font("Arial", Font.BOLD, 20));
        this.panel.add(title);
        this.panel.add(Box.createHorizontalStrut(50));

        this.panel.add(Box.createVerticalStrut(75));
        
        JButton solverButton = new JButton("Solver");
        solverButton.setPreferredSize(new Dimension(100, 90));
        solverButton.addActionListener(_ -> { main.SudokuSuite.SolverPage.display(); });
        this.panel.add(solverButton);
        
        JButton generatorButton = new JButton("Generator");
        generatorButton.setPreferredSize(new Dimension(100, 90));
        generatorButton.addActionListener(_ -> { main.SudokuSuite.GeneratorPage.display(); });
        this.panel.add(generatorButton);
    }
}

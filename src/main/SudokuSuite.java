package main;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import pages.GeneratorPage;
import pages.MenuPage;
import pages.SolverPage;
import ui.*;

public class SudokuSuite {
    public static Page GeneratorPage;
    public static Page SolverPage;
    public static Page MenuPage;

    public static void main(String[] args) throws Exception {
        Window window = new Window();
        window.display(true);

        MenuPage = new MenuPage(window);
        SolverPage = new SolverPage(window);
        GeneratorPage = new GeneratorPage(window);
                
        MenuPage.display();
    }
}
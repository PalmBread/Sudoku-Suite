package pages;

import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

import ui.Page;

public class SolverPage extends Page {
    public SolverPage(ui.Window window) {
        super(window, new Dimension(500, 500));
        
        JLabel label = new JLabel("Solver Page");
        super.panel.add(label);
    }
}

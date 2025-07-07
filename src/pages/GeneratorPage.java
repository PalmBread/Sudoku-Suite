package pages;

import java.awt.Dimension;
import javax.swing.JLabel;

import ui.Page;

public class GeneratorPage extends Page {
    public GeneratorPage(ui.Window window) {
        super(window, new Dimension(600, 500));
        
        JLabel label = new JLabel("Generator Page");
        super.panel.add(label);
    }
}

package ui;

import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Page {
    public JPanel panel;
    public Dimension size;
    public String index;
    private Window window;

    public Page(Window window, Dimension size) {
        this.panel = new JPanel();
        this.window = window;
        this.size = size;
        this.index = String.valueOf(window.panelCount);
        window.panelCount += 1;
        
        window.panel.add(this.panel, this.index);
    }
    
    public Page(Window window, Dimension size, LayoutManager layout) {
        this(window, size);
        this.size = size;
    }

    public void display() {
        window.displayPage(this);
    }
}

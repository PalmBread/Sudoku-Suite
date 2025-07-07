package ui;

import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JPanel;

public class Page {
    public JPanel panel;
    public Dimension size;
    private Window window;

    public Page(Window window, Dimension size) {
        this.panel = new JPanel();
        this.window = window;
        this.size = size;

        window.panel.add(this.panel, window.panelCount);
        window.panelCount += 1;
    }
    
    public Page(Window window, Dimension size, LayoutManager layout) {
        this.panel = new JPanel(layout);
        this.window = window;
        this.size = size;
    }

    public void display() {
        window.displayPage(this);
    }
}

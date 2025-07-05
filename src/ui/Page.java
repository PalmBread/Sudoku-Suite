package ui;

import javax.swing.JPanel;

public class Page {
    public JPanel panel = new JPanel();
    private Window window;

    public Page(Window window) {
        this.window = window;
    }

    public void display() {
        window.displayPage(this);
    }
}

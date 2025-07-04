package Window;

import javax.swing.JPanel;

public class Page {
    public JPanel panel = new JPanel();

    public Page(String name, Window window) {
        window.addPage(name, this);
    }
}

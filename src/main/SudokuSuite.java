package main;

import ui.*;

public class SudokuSuite {
    public static void main(String[] args) throws Exception {
        Window window = new Window();
        window.show(true);

        Page MenuPage = new Page(window);
        MenuPage.display();
    }
}
package core;

public class SudokuBoard {
    private int[] Board = new int[81];

    public SudokuBoard() {
        reset();
    }

    public void reset() {
        for (int i = 0; i < this.Board.length; i++) {
            this.Board[i] = 0;
        }
    }

    public void set(int index, int value) {
        if (index >= 0 && index < this.Board.length) {
            this.Board[index] = value;
        }
    }

    public void set2d(int x, int y, int value) {
        this.Board[x * 9 + y] = value;
    }

    public int get(int index) {
        if (index >= 0 && index < this.Board.length) {
            return this.Board[index];
        }
        return -1; 
    }

    public int get2d(int x, int y) {
        if (x < 0 || x >= 9 || y < 0 || y >= 9) {
            return -1;
        }

        return this.Board[x * 9 + y];
    }
}

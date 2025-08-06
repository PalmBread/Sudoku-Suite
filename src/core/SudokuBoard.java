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

    public void print() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                int value = this.get2d(row, col);
                System.out.print((value == 0 ? "." : value) + " ");
            }
            System.out.println();
        }
    }

    public void union(SudokuBoard Board) {
        for (int i = 0; i < 81; i++) {
            if (this.get(i) == 0) { continue; }
            this.set(i, Board.get(i));
        }
    }
}

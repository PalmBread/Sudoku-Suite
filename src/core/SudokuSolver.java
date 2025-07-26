package core;

import java.util.ArrayList;

public class SudokuSolver {
    public static void solve(SudokuBoard Board) {
        ArrayList<Integer>[] board = new ArrayList[81];

        for (int i = 0; i < 81; i++) {
            board[i] = new ArrayList<>();

            int value = Board.get(i);
            if (value == 0) { 
                for (int _value = 1; _value <= 9; _value++) {
                    if (
                        rowCheck(Board, i / 9, _value) ||
                        columnCheck(Board, i % 9, _value) ||
                        moduleCheck(Board, i, _value)
                    ) { continue; }

                    board[i].add(_value);
                }
                continue;
            }
            board[i].add(Board.get(i));
        }

        SudokuSolver.print(board);
    }

    public static void print(SudokuBoard board) {
    for (int row = 0; row < 9; row++) {
        for (int col = 0; col < 9; col++) {
            int value = board.get2d(row, col);
            System.out.print((value == 0 ? "." : value) + " ");
        }
        System.out.println();
    }
}

    private static boolean moduleCheck(SudokuBoard Board, int index, int value) {
        int a = (index / 3) % 3;
        int b = index / 27;
        int module = a + 3 * b;

        int[] numbers = {0, 1, 2, 9, 10, 11, 18, 19, 20};
        for (int i = 0; i < 9; i++) {
            int n = module + numbers[i];
            if (value == Board.get(n)) {
                return true;
            }
        }

        return false;
    }
    
    private static boolean rowCheck(SudokuBoard Board, int column, int value) {
        for (int i = 0; i < 9; i++) {
            if (value == Board.get2d(i, column)) {
                return true;
            }
        }

        return false;
    }

    private static boolean columnCheck(SudokuBoard Board, int row, int value) {
        for (int i = 0; i < 9; i++) {
            if (value == Board.get2d(row, i)) {
                return true;
            }
        }

        return false;
    }
}

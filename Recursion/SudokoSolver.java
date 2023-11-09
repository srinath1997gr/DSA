import java.util.Arrays;

public class SudokoSolver {

    public static void main(String[] args) {

        int[][] maze = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

        solver(maze, 0, 0);

    }

    public static void solver(int[][] board, int r, int c) {

        if (r == board.length) {
            display(board);
            return;
        }

        if (c == board.length) {
            for (int i = 0; i < board.length; i++) {
                if (board[r][i] == 0) {
                    return;
                }
            }
            c = 0;
            r = r + 1;
        }

        if (r < board.length && c < board.length && board[r][c] == 0) {

            for (int i = 1; i <= 9; i++) {

                if (isSafe(board, r, c, i)) {
                    board[r][c] = i;
                    solver(board, r, c + 1);
                    board[r][c] = 0;
                }

            }
        } else {
            solver(board, r, c + 1);
        }
    }

    public static boolean isSafe(int[][] board, int r, int c, int num) {

        for (int i = 0; i < board.length; i++) {
            if (board[r][i] == num) {
                return false;
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[j][c] == num) {
                return false;
            }
        }

        for (int x = r - r % 3; x < (r - r % 3) + 3; x++) {
            for (int y = c - c % 3; y < (c - c % 3) + 3; y++) {
                if (board[x][y] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    private static void display(int[][] board) {

        for (int[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
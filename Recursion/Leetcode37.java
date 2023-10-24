import java.util.Arrays;

public class Leetcode37 {

    public static void main(String[] args) {

        char[][] maze = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

        solver(maze, 0, 0);

    }

    public static boolean solver(char[][] board, int r, int c) {

        if (r == board.length) {
            display(board);
            return true;
        }

        if (c == board.length) {
            for (int i = 0; i < board.length; i++) {
                if (board[r][i] == '.') {
                    return false;
                }
            }
            c = 0;
            r = r + 1;
        }

        if (r < board.length && c < board.length && board[r][c] == '.') {

            for (int i = 1; i <= 9; i++) {

                if (isSafe(board, r, c, Integer.toString(i).charAt(0))) {
                    board[r][c] = Integer.toString(i).charAt(0);
                    if (solver(board, r, c + 1))
                        return true;
                    board[r][c] = '.';
                }

            }
        } else {
            return solver(board, r, c + 1);
        }

        return false;
    }

    public static boolean isSafe(char[][] board, int r, int c, char num) {

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

    private static void display(char[][] board) {

        for (char[] arr : board) {
            System.out.println(Arrays.toString(arr));
        }
    }
}
import java.util.Arrays;

public class Nqueens {

    public static void main(String[] args) {

        boolean maze[][] = {
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false }
        };

        int n = 5;
        boolean[][] board = new boolean[n][n];

        System.out.println(nQueens(board, 0));

    }

    static int nQueens(boolean[][] maze, int r) {

        if (r == maze.length) {
            for (boolean[] arr : maze) {
                for (boolean elemnet : arr) {
                    if (elemnet) {
                        System.out.print("Q ");
                    } else {
                        System.out.print("X ");
                    }
                }
                System.out.println();
            }

            System.out.println("------------");
            return 1;
        }

        int count = 0;
        for (int c = 0; c < maze.length; c++) {

            if (isSafe(maze, r, c)) {
                maze[r][c] = true;
                count = count + nQueens(maze, r + 1);
                maze[r][c] = false;
            }

        }

        return count;
    }

    private static boolean isSafe(boolean[][] maze, int r, int c) {

        for (int i = 0; i < r; i++) {
            if (maze[i][c]) {
                return false;
            }
        }
        int maxleft = Math.min(r, c);

        for (int k = 1; k <= maxleft; k++) {
            if (maze[r - k][c - k]) {
                return false;
            }
        }

        int maxRight = Math.min(r, maze.length - c - 1);

        for (int x = 1; x <= maxRight; x++) {
            if (maze[r - x][c + x]) {
                return false;
            }
        }
        return true;
    }

}

public class Nkinghts {

    public static void main(String[] args) {

        boolean maze[][] = {
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false },
                { false, false, false, false }
        };

        int n = 4;
        boolean[][] board = new boolean[n][n];

        System.out.println(nknights(board, 0, 0, n));

    }

    static int nknights(boolean[][] maze, int r, int c, int n) {

        if (n == 0) {
            for (boolean[] arr : maze) {
                for (boolean elemnet : arr) {
                    if (elemnet) {
                        System.out.print("K ");
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
        if (c == maze.length) {
            c = 0;
            r = r + 1;
        }
        if (r == maze.length) {
            return 0;
        }
        if (isSafe(maze, r, c)) {
            maze[r][c] = true;
            count = count + nknights(maze, r, c + 1, n - 1);
            maze[r][c] = false;
        }

        count = count + nknights(maze, r, c + 1, n);

        return count;

    }

    private static boolean isSafe(boolean[][] maze, int r, int c) {

        if (isValid(maze, r - 2, c + 1) && maze[r - 2][c + 1]) {
            return false;
        }

        if (isValid(maze, r - 2, c - 1) && maze[r - 2][c - 1]) {
            return false;
        }

        if (isValid(maze, r - 1, c + 2) && maze[r - 1][c + 2]) {
            return false;
        }

        if (isValid(maze, r - 1, c - 2) && maze[r - 1][c - 2]) {
            return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int i, int j) {
        if (i >= 0 && i < board.length && j >= 0 && j < board.length) {
            return true;
        }

        return false;
    }

}

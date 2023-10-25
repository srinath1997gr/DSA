import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maze {

    public static void main(String[] args) {

        // System.out.println(countOfPaths(3, 3));

        // differentPaths("", 3, 3);

        // System.out.println(differentPathsList("", 3, 3).toString());

        // System.out.println(differentPathsListWithDiagonal("", 3, 3).toString());

        boolean[][] board = {
                { true, true, true },
                { true, true, true },
                { true, true, true }
        };

        // differentPathsWithRestrictions("", board, 0, 0);

        // differentPathsWithRestrictions2("", board, 0, 0);

        int[][] a = new int[board.length][board[0].length];

        printPaths("", board, 0, 0, a, 1);

    }

    public static int countOfPaths(int r, int c) {

        if (r == 1 || c == 1) {
            return 1;
        }

        int down = countOfPaths(r - 1, c);
        int right = countOfPaths(r, c - 1);

        return down + right;

    }

    public static void differentPaths(String p, int r, int c) {

        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            differentPaths(p + "D", r - 1, c);
        }
        if (c > 1) {
            differentPaths(p + "R", r, c - 1);
        }
    }

    public static List<String> differentPathsList(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> outsideList = new ArrayList<>();

        if (r > 1) {
            outsideList.addAll(differentPathsList(p + "D", r - 1, c));
        }
        if (c > 1) {
            outsideList.addAll(differentPathsList(p + "R", r, c - 1));
        }

        return outsideList;
    }

    public static List<String> differentPathsListWithDiagonal(String p, int r, int c) {

        if (r == 1 && c == 1) {
            ArrayList<String> l = new ArrayList<>();
            l.add(p);
            return l;
        }

        List<String> outsideList = new ArrayList<>();

        if (r > 1 && c > 1) {
            outsideList.addAll(differentPathsListWithDiagonal(p + "D", r - 1, c - 1));
        }
        if (r > 1) {
            outsideList.addAll(differentPathsListWithDiagonal(p + "V", r - 1, c));
        }
        if (c > 1) {
            outsideList.addAll(differentPathsListWithDiagonal(p + "H", r, c - 1));
        }

        return outsideList;
    }

    public static void differentPathsWithRestrictions(String p, boolean[][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c])
            return;

        if (r < maze.length - 1) {
            differentPathsWithRestrictions(p + "D", maze, r + 1, c);
        }
        if (c < maze[0].length - 1) {
            differentPathsWithRestrictions(p + "R", maze, r, c + 1);
        }
    }

    public static void differentPathsWithRestrictions2(String p, boolean[][] maze, int r, int c) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!maze[r][c])
            return;

        maze[r][c] = false;

        if (r < maze.length - 1) {
            differentPathsWithRestrictions2(p + "D", maze, r + 1, c);
        }

        if (c < maze[0].length - 1) {
            differentPathsWithRestrictions2(p + "R", maze, r, c + 1);
        }

        if (r > 0) {
            differentPathsWithRestrictions2(p + "U", maze, r - 1, c);
        }

        if (c > 0) {
            differentPathsWithRestrictions2(p + "L", maze, r, c - 1);
        }

        maze[r][c] = true;

    }

    public static void printPaths(String p, boolean[][] maze, int r, int c, int[][] path, int step) {

        if (r == maze.length - 1 && c == maze[0].length - 1) {
            path[r][c] = step;
            for (int[] arr : path) {
                System.out.println(Arrays.toString(arr));
            }

            System.out.println(p);
            return;
        }

        if (!maze[r][c])
            return;

        maze[r][c] = false;
        path[r][c] = step;

        if (r < maze.length - 1) {
            printPaths(p + "D", maze, r + 1, c, path, step + 1);
        }

        if (c < maze[0].length - 1) {
            printPaths(p + "R", maze, r, c + 1, path, step + 1);
        }

        if (r > 0) {
            printPaths(p + "U", maze, r - 1, c, path, step + 1);
        }

        if (c > 0) {
            printPaths(p + "L", maze, r, c - 1, path, step + 1);
        }

        maze[r][c] = true;
        path[r][c] = 0;

    }
}

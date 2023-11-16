package GeeksForGeeks;

public class CelebrityProblem {

    public static int celebrity(int mat[][]) {
        // code here
        int count;
        int count2;
        int n = mat.length;
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    count++;
                }
                if (count == n) {
                    s.push(i);
                }
            }
        }

        while (!s.isEmpty()) {
            int c = s.pop();
            count2 = 0;
            for (int i = 0; i < n; i++) {
                if (mat[i][c] == 1) {
                    count2++;
                }
                if (count2 == n - 1) {
                    return c;
                }
            }
        }

        return -1;
    }

    
    
    public static void main(String[] args) {
        int[][] arr = {
                { 0, 1, 0 },
                { 0, 0, 0 },
                { 0, 1, 0 }
        };

        System.out.println(celebrity(arr));
    }

}

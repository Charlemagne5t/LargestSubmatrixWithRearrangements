import java.util.Arrays;

public class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] matrixConsecutive = new int[m][n];

        for (int i = 0; i < n; i++) {
            int cur = 0;
            for (int j = 0; j < m; j++) {
                if (matrix[j][i] == 0) {
                    matrixConsecutive[j][i] = 0;
                    cur = 0;
                } else {
                    cur++;
                    matrixConsecutive[j][i] = cur;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < m; i++) {
            Arrays.sort(matrixConsecutive[i]);
            System.out.println(Arrays.toString(matrixConsecutive[i]));
            for (int j = n - 1, k = 1; j >= 0 && matrixConsecutive[i][j] > 0; j--, k++) {
                max = Math.max(matrixConsecutive[i][j] * k, max);
            }
        }


        return max;
    }
}

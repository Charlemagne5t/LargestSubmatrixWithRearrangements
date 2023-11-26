import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void largestSubmatrixTest1() {
        int[][] matrix = {
                {0, 0, 1},
                {1, 1, 1},
                {1, 0, 1}
        };
        int expected = 4;
        int actual = new Solution().largestSubmatrix(matrix);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void largestSubmatrixTest2() {
        int[][] matrix = {
                {1, 0, 1, 0, 1},
        };
        int expected = 3;
        int actual = new Solution().largestSubmatrix(matrix);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void largestSubmatrixTest3() {
        int[][] matrix = {
                {1, 1, 0},
                {1, 0, 1},
        };
        int expected = 2;
        int actual = new Solution().largestSubmatrix(matrix);

        Assert.assertEquals(expected, actual);
    }
}

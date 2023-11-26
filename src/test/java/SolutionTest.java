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
}

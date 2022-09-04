import junit.framework.TestCase;
import org.junit.Test;

public class SubTest {
    @Test
    public void subTest() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        double[][] nums2 = {{1, 3, 2}, {3, 4, 6}, {2, 7, 9}};
        double[][] resultWait = {{1, 0, 2}, {2, 2, 1}, {0, -3, -3}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.sub(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

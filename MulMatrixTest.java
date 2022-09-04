import junit.framework.TestCase;
import org.junit.Test;

public class MulMatrixTest {
    @Test
    public void mulMatrixTest() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        double[][] nums2 = {{1, 3, 2}, {3, 4, 6}, {2, 7, 9}};
        double[][] resultWait = {{19, 46, 58}, {37, 88, 109}, {26, 64, 82}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.mul(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

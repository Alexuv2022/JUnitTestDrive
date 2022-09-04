import junit.framework.TestCase;
import org.junit.Test;

public class TransposeTest {
    @Test
    public void TransposeTest() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix matrixForResultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 5, 2}, {3, 6, 4}, {4, 7, 6}};
        IMatrix resultFact = matrixForResultFact.transpose();

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }

    }
}

import junit.framework.TestCase;
import org.junit.Test;

public class TransposeTest {
    @Test
    public void TransposeTest1() {
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

    @Test
    public void TransposeTest2() {
        double[][] nums1 = {{2, 3, 4, 8}, {5, 6, 7, 4}, {-2, 4, 6, 3}, {12, -4, 6, 38}, {14, -4, 6, 38}};
        Matrix matrixForResultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 5, -2, 12, 14}, {3, 6, 4, -4, -4}, {4, 7, 6, 6, 6}, {8, 4, 3, 38, 38}};
        IMatrix resultFact = matrixForResultFact.transpose();

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
        @Test
        public void TransposeTest3() {
            double[][] nums1 = {{1, 3, 2, 6}, {3, -4, 6, -8}, {-2, -7, -9, -11}};
            Matrix matrixForResultFact = new Matrix(nums1);
            double[][] resultWait = {{1, 3, -2}, {3, -4, -7}, {2, 6, -9}, {6, -8, -11}};
            IMatrix resultFact = matrixForResultFact.transpose();

            for (int i = 0; i < resultFact.getRows(); i++) {
                for (int j = 0; j < resultFact.getColumns(); j++) {
                    TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
                }
            }
    }
}

import junit.framework.TestCase;
import org.junit.Test;

public class MulDoubleTest {
    @Test
    public void mulDoubleTest1() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        double value = 2.5;
        double[][] resultWait = {{5, 7.5, 10}, {12.5, 15, 17.5}, {5, 10, 15}};
        Matrix matrix1 = new Matrix(nums1);

        IMatrix resultFact = matrix1.mul(value);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void mulDoubleTest2() {
        double[][] nums1 = {{2, 3, -4}, {5, 6, 7}, {2, -4, 6}, {-7, 8, 9}};
        double value = -2.5;
        double[][] resultWait = {{-5, -7.5, 10}, {-12.5, -15, -17.5}, {-5, 10, -15}, {17.5, -20.0, -22.5}};
        Matrix matrix1 = new Matrix(nums1);

        IMatrix resultFact = matrix1.mul(value);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void mulDoubleTest3() {
        double[][] nums1 = {{2, 3, -4, 8, -1}, {5, -6, 7, 5, 12}, {2, -4, 6, 4, -1}, {-7, 8, 9, 11, 24}};
        double value = 3.0;
        double[][] resultWait = {{6, 9, -12, 24, -3}, {15, -18, 21, 15, 36}, {6, -12, 18, 12, -3}, {-21, 24, 27, 33, 72}};
        Matrix matrix1 = new Matrix(nums1);

        IMatrix resultFact = matrix1.mul(value);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

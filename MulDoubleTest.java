import junit.framework.TestCase;
import org.junit.Test;

public class MulDoubleTest {
    @Test
    public void mulDoubleTest() {
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
}

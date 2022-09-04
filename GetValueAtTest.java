import junit.framework.TestCase;
import org.junit.Test;

public class GetValueAtTest {
    @Test
    public void getValueAtTest() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix resultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

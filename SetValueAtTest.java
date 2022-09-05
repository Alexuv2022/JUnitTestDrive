import junit.framework.TestCase;
import org.junit.Test;

public class SetValueAtTest {
    @Test
    public void setValueAtTest1() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix resultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 3, 4}, {5, 8, 7}, {2, 4, 6}};

        resultFact.setValueAt(1, 1, 8);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void setValueAtTest2() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}, {2, 4, 6}};
        Matrix resultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 3, 4}, {5, 6, -128}, {2, 4, 6}, {2, 4, 6}};

        resultFact.setValueAt(1, 2, -128);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

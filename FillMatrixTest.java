import junit.framework.TestCase;
import org.junit.Test;

public class FillMatrixTest {
    @Test
    public void fillMatrixTest1() {
        double[][] resultWait = {{7.5, 7.5, 7.5}, {7.5, 7.5, 7.5}, {7.5, 7.5, 7.5}, {7.5, 7.5, 7.5}};
        Matrix resultFact = new Matrix(4, 3);
        resultFact.fillMatrix(7.5);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void fillMatrixTest2() {
        double[][] resultWait = {{-8.0, -8.0, -8.0, -8.0, -8.0}, {-8.0, -8.0, -8.0, -8.0, -8.0}, {-8.0, -8.0, -8.0, -8.0, -8.0}, {-8.0, -8.0, -8.0, -8.0, -8.0}};
        Matrix resultFact = new Matrix(4, 5);
        resultFact.fillMatrix(-8.0);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

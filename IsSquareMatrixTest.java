import junit.framework.TestCase;
import org.junit.Test;

public class IsSquareMatrixTest {
    @Test
    public void isSquareMatrixTest() {
        double[][] nums = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 3}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isSquareMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

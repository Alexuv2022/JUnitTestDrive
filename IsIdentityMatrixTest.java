import junit.framework.TestCase;
import org.junit.Test;

public class IsIdentityMatrixTest {
    @Test
    public void isIdentityMatrixTest() {
        double[][] nums = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = true;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

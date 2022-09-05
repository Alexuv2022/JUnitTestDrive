import junit.framework.TestCase;
import org.junit.Test;

public class IsSquareMatrixTest {
    @Test
    public void isSquareMatrixTest1() {
        double[][] nums = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}, {0, 0, 3}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isSquareMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isSquareMatrixTest2() {
        double[][] nums = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = true;
        boolean resultFact = matrix.isSquareMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isSquareMatrixTest3() {
        double[][] nums = {{8, -10, 0}, {20, 1, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isSquareMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

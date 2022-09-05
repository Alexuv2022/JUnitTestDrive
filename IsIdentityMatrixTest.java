import junit.framework.TestCase;
import org.junit.Test;

public class IsIdentityMatrixTest {
    @Test
    public void isIdentityMatrixTest1() {
        double[][] nums = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = true;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest2() {
        double[][] nums = {{-1, 0, 0, 0}, {0, -1, 0, 0}, {0, 0, -1, 0}, {0, 0, 0, -1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest3() {
        double[][] nums = {{1, 10, 40, -50}, {2, 1, 3, 0}, {10, 8, 1, 7}, {0, 2, 3, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest4() {
        double[][] nums = {{0, 0, 0, 1}, {0, 0, 1, 0}, {0, 1, 0, 0}, {1, 0, 0, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest5() {
        double[][] nums = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, -1, 0}, {0, 0, 0, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest6() {
        double[][] nums = {{1, 0, 0, 0}, {0, 1, 0, -1}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest7() {
        double[][] nums = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isIdentityMatrixTest8() {
        double[][] nums = {{1, 0, 0, 0, 0}, {0, 1, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 1, 0}, {0, 0, 0, 0, 1}, {0, 0, 0, 0, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isIdentityMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

import junit.framework.TestCase;
import org.junit.Test;

public class DeterminantTest {

    @Test
    public void determinant1() {
        double[][] nums = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix matrix = new Matrix(nums);

        double resultFact = matrix.determinant();
        double resultWait = 0.0;

        TestCase.assertEquals(resultFact, resultWait);
    }

    @Test
    public void determinant2() {
        double[][] nums = {{1, 2, 3, 4}, {5, -6, 79, 65}, {-43, 4, -1, 5}, {12, 32, -11, 7}};
        Matrix matrix = new Matrix(nums);

        double resultFact = matrix.determinant();
        double resultWait = 41218.0;

        TestCase.assertEquals(resultFact, resultWait);
    }
}

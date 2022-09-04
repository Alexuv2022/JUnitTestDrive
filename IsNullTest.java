import junit.framework.TestCase;
import org.junit.Test;

public class IsNullTest {
    @Test
    public void isNullTest() {
        double[][] nums = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

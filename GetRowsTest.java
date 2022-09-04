import junit.framework.TestCase;
import org.junit.Test;

public class GetRowsTest {
    @Test
    public void getRowTest() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix resultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};

        TestCase.assertEquals(resultWait.length, resultFact.getRows());
    }
}

import junit.framework.TestCase;
import org.junit.Test;

public class GetColumnsTest {
    @Test
    public void getColumnTest() {
        double[][] nums1 = {{2, 3, 4, 7}, {5, 6, 7, 0}, {2, 4, 6, 13}};
        Matrix resultFact = new Matrix(nums1);
        double[][] resultWait = {{2, 3, 4, 7}, {5, 6, 7, 0}, {2, 4, 6, 13}};

        TestCase.assertEquals(resultWait[0].length, resultFact.getColumns());
    }
}

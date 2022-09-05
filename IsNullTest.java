import junit.framework.TestCase;
import org.junit.Test;

public class IsNullTest {
    @Test
    public void isNullTest1() {
        double[][] nums = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
    @Test
    public void isNullTest2() {
        double[][] nums = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 6, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest3() {
        double[][] nums = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = true;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest4() {
        double[][] nums = {{-1, -1, -3, -3}, {-11, -14, -5, -80}, {-70, -2, -7, -3}, {-6, -5, -76, -9}, {-43, -17, -89, -45}, {-67, -33, -13, -17}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest5() {
        double[][] nums = {{0, 0, 0, 0}, {-11, -14, -5, -80}, {0, 0, 0, 0}, {-6, -5, -76, -9}, {-43, -17, -89, -45}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest6() {
        double[][] nums = {{0, 0, 0, 0}, {11, 14, 5, 80}, {0, 0, 0, 0}, {-6, -5, -76, -9}, {0, 0, 0, -45}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = false;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest7() {
        double[][] nums = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        Matrix matrix = new Matrix(nums);

        boolean resultWait = true;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }

    @Test
    public void isNullTest8() {
        Matrix matrix = new Matrix();

        boolean resultWait = true;
        boolean resultFact = matrix.isNullMatrix();

        TestCase.assertEquals(resultWait, resultFact);
    }
}

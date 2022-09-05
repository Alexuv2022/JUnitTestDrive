import junit.framework.TestCase;
import org.junit.Test;

public class AddTest {

    @Test
    public void addTest1() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        double[][] nums2 = {{1, 3, 2}, {3, 4, 6}, {2, 7, 9}};
        double[][] resultWait = {{3.0, 6.0, 6.0}, {8.0, 10.0, 13.0}, {4.0, 11.0, 15.0}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.add(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void addTest2() {
        double[][] nums1 = {{2, 31, 4, 11}, {5, 16, 7, 28}, {22, 4, -5, 6}, {6, 49, 8, -9}};
        double[][] nums2 = {{1, 3, -2, 0}, {3, -41, 6, 76}, {2, 7, 94, 6},  {32, -67, 34, 16}};
        double[][] resultWait = {{3.0, 34.0, 2.0, 11.0}, {8.0, -25.0, 13.0, 104}, {24.0, 11.0, 89.0, 12.0}, {38.0, -18.0, 42.0, 7.0}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.add(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void addTest3() {
        double[][] nums1 = {{2, 31, 4, 11}, {5, 16, 7, 28}, {22, 4, -5, 6}, {6, 49, 8, -9}};
        double[][] nums2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},  {0, 0, 0, 0}};
        double[][] resultWait = {{2, 31, 4, 11}, {5, 16, 7, 28}, {22, 4, -5, 6}, {6, 49, 8, -9}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.add(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void addTest4() {
        double[][] nums1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0},  {0, 0, 0, 0}};
        double[][] nums2 = {{2, 31, 4, 11}, {5, 16, 7, 28}, {22, 4, -5, 6}, {6, 49, 8, -9}};
        double[][] resultWait = {{2, 31, 4, 11}, {5, 16, 7, 28}, {22, 4, -5, 6}, {6, 49, 8, -9}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.add(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

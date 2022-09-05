import junit.framework.TestCase;
import org.junit.Test;

public class SubTest {
    @Test
    public void subTest1() {
        double[][] nums1 = {{2, 3, 4}, {5, 6, 7}, {2, 4, 6}};
        double[][] nums2 = {{1, 3, 2}, {3, 4, 6}, {2, 7, 9}};
        double[][] resultWait = {{1, 0, 2}, {2, 2, 1}, {0, -3, -3}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.sub(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void subTest2() {
        double[][] nums1 = {{2, 3, 4, 8}, {5, 6, 7, 4}, {-2, 4, 6, 3}, {12, -4, 6, 38}, {14, -4, 6, 38}};
        double[][] nums2 = {{1, 3, 2, 6}, {3, -4, 6, -8}, {-2, -7, -9, -11}, {-21, 7, 19, -11}, {2, 17, 9, -13}};
        double[][] resultWait = {{1, 0, 2, 2}, {2, 10, 1, 12}, {0, 11, 15, 14}, {33, -11, -13, 49}, {12, -21, -3, 51}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.sub(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }

    @Test
    public void subTest3() {
        double[][] nums1 = {{2, 3, 4, 8, -2, 7}, {5, 6, 7, 4, -1, 11}, {-2, 4, 6, 3, 4, -9}, {12, -4, 6, -6, 2, -38}, {14, -4, 6, 38, 21, 12}};
        double[][] nums2 = {{1, 3, 2, 6, 4, -2}, {3, -4, 6, -8, 12, 9}, {-2, -7, -9, -11, 4, 0}, {-21, 7, 19, -11, 5, 3}, {2, 17, 9, -13, 2, 18}};
        double[][] resultWait = {{1, 0, 2, 2, -6, 9}, {2, 10, 1, 12, -13, 2}, {0, 11, 15, 14, 0, -9}, {33, -11, -13, 5, -3, -41}, {12, -21, -3, 51, 19, -6}};

        Matrix matrix1 = new Matrix(nums1);
        Matrix matrix2 = new Matrix(nums2);

        IMatrix resultFact = matrix1.sub(matrix2);

        for (int i = 0; i < resultFact.getRows(); i++) {
            for (int j = 0; j < resultFact.getColumns(); j++) {
                TestCase.assertEquals(resultWait[i][j], resultFact.getValueAt(i, j));
            }
        }
    }
}

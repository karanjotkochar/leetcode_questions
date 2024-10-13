import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q_2022_Convert_1D_to_2D_Array {
//    https://leetcode.com/problems/convert-1d-array-into-2d-array/
    public static void main(String[] args) {
//        construct2DArray();
//        construct2DArray2();
    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        int[][] outArray = new int[m][n];

        if(m*n != original.length) {
            return new int[0][0];
        }

        for (int i=0; i < original.length; i++) {
            for(int j=0; j<m; j++) {
                for (int k=0; k<n; k++) {
                    outArray[j][k] = original[i++];
                }
            }
        }

        return outArray;
    }

    public int[][] construct2DArray2(int[] original, int m, int n) {
        int[][] outArray = new int[m][n];
        int i=0;

        if(m*n != original.length) {
            return new int[0][0];
        }

        for(int j=0; j<m; j++) {
            for (int k=0; k<n; k++) {
                outArray[j][k] = original[i++];
            }
        }

        return outArray;
    }
}

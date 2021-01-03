/**
 * 48旋转图像
 */
public class Solution0048 {
    public void rotate(int[][] matrix) {
        for (int i = 0;i<matrix.length/2;i++){
            for (int j = i;j<matrix.length-i-1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-i-1][matrix.length-1-j];
                matrix[matrix.length-i-1][matrix.length-1-j] = matrix[j][matrix.length-i-1];
                matrix[j][matrix.length-i-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {

    }
}

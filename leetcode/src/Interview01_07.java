/**
 * 面试题 01.07. 旋转矩阵
 */
public class Interview01_07 {
    public void rotate(int[][] matrix) {
        for (int i = 0;i<matrix.length/2;i++){
            for (int j = i;j<matrix[i].length-i-1;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length-1-j][i];
                matrix[matrix.length-1-j][i] = matrix[matrix.length-1-i][matrix.length-1-j];
                matrix[matrix.length-1-i][matrix.length-1-j] = matrix[j][matrix.length-1-i];
                matrix[j][matrix.length-1-i] = tmp;
            }
        }
    }
}

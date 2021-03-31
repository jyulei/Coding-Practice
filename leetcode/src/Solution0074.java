/**
 * 74. 搜索二维矩阵
 */
public class Solution0074 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        for (int i = 0; i<matrix.length;i++){
            if (i+1>matrix.length-1){
                row = i;
                break;
            }
            if (matrix[i][0]<=target && matrix[i+1][0]>target){
                row = i;
                break;
            }
        }
        if (row == -1) {
            return false;
        }
        for (int j = 0; j < matrix[row].length; j++){
            if (matrix[row][j] == target) {
                return true;
            }
        }
        return false;
    }
}

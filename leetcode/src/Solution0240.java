/**
 * 240、搜索二维矩阵 II
 */
public class Solution0240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0;
        int left=0,right=matrix.length-1;
        for (row=0;row<matrix.length;row++){
            if (matrix[row][0]>target){
                break;
            } else {
                left=0;
                right=matrix[row].length-1;
                while (left < right) {
                    int mid=left+(right-left)>>1;
                    if (matrix[row][mid]>target){
                        right=mid-1;
                    } else if (matrix[row][mid]<target){
                        left=mid+1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

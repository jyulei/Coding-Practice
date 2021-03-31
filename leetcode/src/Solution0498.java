public class Solution0498 {
    public static int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return new int[0];
        }
        int[] result = new int[matrix.length*matrix[0].length];
        int k = 0;
        boolean t = true;
        int i =0,j =0;
        while (true){
            if (i == matrix.length - 1 && j == matrix[0].length - 1) {
                break;
            }
            if (t) {
                result[k++] = matrix[i][j];
                if (j == matrix[0].length - 1) {
                    t=false;
                    i++;
                } else if (i == 0) {
                    t=false;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                result[k++] = matrix[i][j];
                if (i == matrix.length - 1) {
                    t=true;
                    j++;
                } else if (j == 0) {
                    t=true;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        result[k] = matrix[i][j];
        return result;
    }

    public static void main(String[] args) {
        int[][] a = new int[][]{{6,9,7}};
        int[] result = findDiagonalOrder(a);
        System.out.println(result.toString());
    }
}

/**
 * 279. 完全平方数
 */
public class Solution0279 {
    public static int numSquares(int n) {
        int result = 0;
        while (n != 0) {
            int sub = (int)Math.floor(Math.sqrt((double) n));
            n = n - sub * sub;
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numSquares(12));
    }
}

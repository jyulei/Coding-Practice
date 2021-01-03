/**
 * 461.汉明距离
 */
public class Solution0461 {
    public static int hammingDistance(int x, int y) {
        int a = x ^ y;
        int result = 0;
        while (a != 0) {
            int b = a & 1;
            if (b == 1) {
                result++;
            }
            a = a >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(9,8));
    }
}

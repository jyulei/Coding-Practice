/**
 * 326.3的幂次
 */
public class Solution0326 {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        while (n != 1) {
            if (n % 3 != 0) {
                return false;
            } else {
                n = n / 3;
            }
        }
        return true;
    }
}

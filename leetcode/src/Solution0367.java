/**
 * 367. 有效的完全平方数
 */
public class Solution0367 {
    public boolean isPerfectSquare(int num) {
        int left = 0, right = num;
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long tmp =  mid * mid;
            if (tmp > Integer.MAX_VALUE){
                right = (int)(mid -1);
                continue;
            }
            if (tmp == num) {
                return true;
            } else if (tmp > num) {
                right = (int)(mid -1);
            } else {
                left = (int)(mid + 1);
            }
        }
        return false;
    }
}

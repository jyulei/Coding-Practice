/**
 * 278.第一个错误的版本
 */
public class Solution0278 {
    public int firstBadVersion(int n) {
        int begin =1,end = n;
        while (begin <= end) {
            int mid = (begin+end)/2;
            if (isBadVersion(mid)) {
                if (mid == begin) {
                    return mid;
                }
                end = mid;
            } else {
                begin = mid + 1;
            }
        }
        return 0;
    }

    private boolean isBadVersion(int n) {
        return false;
    }
}

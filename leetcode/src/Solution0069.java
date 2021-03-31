/**
 * 69. x 的平方根
 */
public class Solution0069 {
    public static int mySqrt(int x) {
        long i;
        for( i = 1; i*i <= x; i++){
        }
        return (int)i-1;
    }

    /**
     * 二分法
     * @param x
     * @return
     */
    public static int mySqrt1(int x) {
        int start = 0, end = x;
        while (start <= end) {
            long mid = (start + end )/2;
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) {
                return (int)mid;
            } else if ((mid + 1) * (mid + 1) <= x){
                start = (int)(mid+1);
            } else {
                end = (int)(mid -1);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
        System.out.println(mySqrt1(1));
    }
}

/**
 * 50. Pow(x, n)
 */
public class Solution0050 {
    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double result = x;
        int abs = Math.abs(n);
        for (int i = 2; i <=abs;i++){
                result = result * x;
        }
        if (n > 0) {
            return result;
        } else {
            return 1/result;
        }
    }
}

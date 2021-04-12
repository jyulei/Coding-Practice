/**
 * 50. Pow(x, n)
 */
public class Solution0050 {
    public double myPow(double x, int n) {
        boolean symbol = true;
        if (n < 0) {
            symbol = false;
            n = -1*n;
        }
        double result = 1;
        while (n != 0) {
            if (n % 2 == 1 || n % 2 == -1) {
                result *=x;
                n--;
            } else {
                x= x*x;
                n=n/2;
            }
        }
        if (symbol == true) {
            return result;
        } else {
            return 1.0/result;
        }
    }
}

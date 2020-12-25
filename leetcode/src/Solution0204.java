/**
 * 204. 计数质数
 *
 * 统计所有小于非负整数 n 的质数的数量。
 */
public class Solution0204 {
    public static int countPrimes(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++){
            if (isPrime(i)) {
                System.out.println(i);
                sum++;
            }
        }
        return sum;
    }

    /**
     * 调用math。pow（a，0.5）的时间是长于i*i<=a的
     * @param i
     * @return
     */
    private static boolean isPrime(int i) {
        if (i == 0 || i == 1) {
            return false;
        } else if (i == 2 ) {
            return true;
        } else {
            for (int j = 2; j * j <= i; ++j){
                if (i % j == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(countPrimes(499979));
    }
}

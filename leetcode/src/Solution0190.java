/**
 * 190. 颠倒二进制位
 */
public class Solution0190 {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++){
            int bit = 1 & n;
            result = (result << 1) + bit;
            n = n >> 1;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(reverseBits(43261596));
    }
}

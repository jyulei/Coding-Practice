/**
 * 191. 位1的个数
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 */
public class Solution0191 {
    public static int hammingWeight(int n) {
        int sum = 0;
        for(int i = 0 ;i < 32; i++){
            if ((n & 1) == 1){
                sum++;
            }
            n = n >> 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(3));
    }
}

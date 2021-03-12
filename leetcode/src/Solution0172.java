import java.util.Scanner;

/**
 * 172. 阶乘后的零
 * 给定一个整数 n，返回 n! 结果尾数中零的数量
 */
public class Solution0172 {
    public static long trailingZeroes(int n) {
        int result = 0;
        while (n >= 5) {
            result += n / 5;
            n = n / 5;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(true){
            int n = s.nextInt();
            System.out.println(trailingZeroes(n));
        }
    }
}

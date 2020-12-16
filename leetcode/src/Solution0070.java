import java.util.Scanner;

public class Solution0070 {
    public static int climbStairs(int n) {
        if (n==1){
            return 1;
        } else if (n == 2) {
            return 2;
        }
        int a = 1 ,b = 2,result = 2;
        for (int i = 3; i <= n; ++i){
            result = a+b;
            a = b;
            b = result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(climbStairs(n));
    }
}

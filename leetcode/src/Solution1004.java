import java.util.Stack;

/**
 * 1006. 笨阶乘
 */
public class Solution1004 {
    public static int clumsy(int N) {
        Stack<Integer> s = new Stack<>();
        s.push(N);
        for (int i = 1; i < N; i++) {
            int tmp = s.pop();
            switch (i % 4) {
                case 1:
                    tmp *= (N - i);
                    s.push(tmp);
                    break;
                case 2:
                    tmp /= (N - i);
                    s.push(tmp);
                    break;
                case 3:
                    tmp += (N - i);
                    s.push(tmp);
                    break;
                case 0:
                    s.push(tmp);
                    s.push(-1 * (N - i));
                    break;
            }
        }
        int result = s.pop();
        while (!s.empty()) {
            result += s.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(clumsy(10));
    }
}

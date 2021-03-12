import java.util.HashSet;

/**
 * 202. 快乐数
 *
 * 编写一个算法来判断一个数 n 是不是快乐数。
 *
 * 「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
 *
 * 如果 n 是快乐数就返回 True ；不是，则返回 False 。
 */
public class Solution0202 {

    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet();
        hashSet.add(n);
        int next = 0;
        while (true) {
            while (n != 0) {
                int tmp = n % 10; //个位
                n = n / 10;
                next += tmp * tmp;
            }
            if (next == 1) {
                return true;
            } else {
                if (hashSet.contains(next)) {
                    return false;
                } else {
                    hashSet.add(next);
                    n = next;
                    next = 0;
                }
            }
        }
    }
}

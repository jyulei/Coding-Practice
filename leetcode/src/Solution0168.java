/**
 * 168. Excel表列名称
 * 给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 */
public class Solution0168 {
    public static String convertToTitle(int n) {
        StringBuilder s = new StringBuilder();
        while (n != 0) {
            n--;        //这一步是关键
            char ch = 65;
            int tmp = n % 26;
            ch += tmp;
            s.append(ch);
            n = n / 26 ;
        }
        s.reverse();
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(28));
    }
}

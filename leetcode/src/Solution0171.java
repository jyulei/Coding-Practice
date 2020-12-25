/**
 * 171. Excel表列序号
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 */
public class Solution0171 {
    public static int titleToNumber(String s) {
        int length = s.length();
        int num = 0;
        for (int i = length - 1,j = 0;i >= 0; i--,j++){
            char ch = s.charAt(i);
            num += (ch - 64) * Math.pow(26,j);
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
//        System.out.println(26 ^ 1);
    }

}

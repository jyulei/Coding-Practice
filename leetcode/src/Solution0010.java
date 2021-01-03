/**
 * 10. 正则表达式匹配
 *
 *  给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 */
public class Solution0010 {
    public boolean isMatch(String s, String p) {
        if (s.length() == 0 && p.length() != 0) {
            return false;
        }
        return true;
    }
}
